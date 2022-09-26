package jdbcpractice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcpractice.dto.Student;
import jdbcpractice.utility.DBConnection;

public class StudentDAOImpl implements StudentDAO {
	
	public Integer addStudent(Student student) {
		int row=0;
		
		try {
			Connection conn=DBConnection.CreateConnection();
			String q="insert into student(name,city) values (?,?)";
			PreparedStatement pstm=conn.prepareStatement(q);
			
			pstm.setString(1, student.getName());
			pstm.setString(2, student.getCity());
			row =pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public Student getStudentById(Integer studentId) {
		Student student=new Student();
		try {
			Connection conn=DBConnection.CreateConnection();
			PreparedStatement pstm=conn.prepareStatement("select * from student where id=?");
			pstm.setInt(1,studentId);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()) {
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public List<Student> getAllStudent() {
	 List<Student> studentlist=new ArrayList();
	 Student student=new Student();
	 try {
			Connection conn=DBConnection.CreateConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery("select * from student");
			if(rs.next()) {
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				studentlist.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentlist;
	}

	public Integer updateStudent(Student student) {
		int row=0;
		try {
			Connection conn=DBConnection.CreateConnection();
			String q="UPDATE student SET name=?, city=? WHERE id=?";
			PreparedStatement pstm=conn.prepareStatement(q);
			pstm.setString(1, student.getName());
			pstm.setString(2, student.getCity());
			pstm.setInt(3,student.getId());
			row=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public Integer deleteStudent(Integer studentId) {
	int row=0;
	
	try {
		Connection conn=DBConnection.CreateConnection();
		String q="DELETE  FROM student WHERE id=?";
		PreparedStatement pstm=conn.prepareStatement(q);
		pstm.setInt(1, studentId);
		row=pstm.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return row;
	}

}

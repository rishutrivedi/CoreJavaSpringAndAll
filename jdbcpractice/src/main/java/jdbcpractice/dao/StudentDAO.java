package jdbcpractice.dao;

import java.util.List;

import jdbcpractice.dto.Student;

public interface StudentDAO {
public Integer addStudent(Student student);
	
	//Retrieve
	public Student getStudentById(Integer studentId);
	
	//Retrieve all customers
	public List<Student> getAllStudent();
	
	//Update
	public Integer updateStudent(Student student);
	
	//Delete
	public Integer deleteStudent(Integer studentId);
}

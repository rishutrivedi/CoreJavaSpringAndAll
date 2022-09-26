package jdbcpractice.service;

import java.util.List;

import jdbcpractice.dao.StudentDAO;
import jdbcpractice.dao.StudentDAOImpl;
import jdbcpractice.dto.Student;

public class StudentServiceImpl implements StudentService {
	StudentDAO sd=new StudentDAOImpl();
	public Integer addStudent(Student student) {
		
		return sd.addStudent(student);
	}

	public Student getStudentById(Integer studentId) {
		
		return sd.getStudentById(studentId);
	}

	public List<Student> getAllStudent() {
		
		return sd.getAllStudent();
	}

	public Integer updateStudent(Student student) {
		
		return sd.updateStudent(student);
	}

	public Integer deleteStudent(Integer studentId) {
		
		return sd.deleteStudent(studentId);
	}

}

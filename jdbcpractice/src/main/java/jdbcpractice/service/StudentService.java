package jdbcpractice.service;

import java.util.List;

import jdbcpractice.dto.Student;

public interface StudentService {
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

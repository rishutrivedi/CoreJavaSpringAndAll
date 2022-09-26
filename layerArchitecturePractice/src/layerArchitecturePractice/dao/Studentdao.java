package layerArchitecturePractice.dao;

import java.util.List;

import layerArchitecturePractice.dto.Student;


public interface Studentdao {

   public void addStudent(Student student);

	public List<Student> getAllStudent();
	
//	public Student getStudentById(Integer id);
	
	public void updateStudent(Integer id);
	
	public void deleteStudent(Integer id);
}

package layerArchitecturePractice.service;

import java.util.List;


import layerArchitecturePractice.dao.Studentdao;
import layerArchitecturePractice.dao.StudentdaoImpl;
import layerArchitecturePractice.dto.Student;


public class StudentServiceImpl implements StudentService {
       Studentdao studentdao=new StudentdaoImpl();

	public void addStudent(Student student) {
		 studentdao.addStudent(student);
        }
	public List<Student> getAllStudent() {
		
		return studentdao.getAllStudent();
	}

//	@Override
//	public Student getStudentById(Integer id){
//		
//		return studentdao.getStudentById(id);
//	}

	@Override
	public void updateStudent(Integer id) {
		// TODO Auto-generated method stub
		studentdao.updateStudent(id);
	}

	@Override
	public void deleteStudent(Integer id) {
	
		studentdao.deleteStudent(id);
	}

}

package layerArchitecturePractice.dao;

import java.util.ArrayList;
import java.util.List;

import layerArchitecturePractice.dto.Student;

public class StudentdaoImpl implements Studentdao {
	List<Student> studentlist=new ArrayList<Student>();

	public void addStudent(Student student) {
		studentlist.add(student);
		
}

	public List<Student> getAllStudent() {
		
		return studentlist;
	}

//	public Student getStudentById(Integer id){
//		
//		for(Student student:studentlist) {
//			if(student.getId()==id)
//				return student;
//		}
//	}

	public void updateStudent(Integer id) {
		for(Student s:studentlist) {
			if(s.getId()==id) {
				s.setName("Ankit");
			}
		}
		
	}

	public void deleteStudent(Integer id) {
		studentlist.remove(id-1);
	}

}

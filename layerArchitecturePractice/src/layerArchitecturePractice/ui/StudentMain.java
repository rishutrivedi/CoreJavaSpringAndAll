package layerArchitecturePractice.ui;

import layerArchitecturePractice.dto.Student;
import layerArchitecturePractice.service.StudentService;
import layerArchitecturePractice.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		Student student[]=new Student[4];
		student[0]=new Student(1,"Rishu","kanpur");
		student[1]=new Student(2,"shivam","aligarh");
		student[2]=new Student(3,"Sachin","varanashi");
		student[3]=new Student(4,"Tinku","Noida");
		StudentService ss=new StudentServiceImpl();
		ss.addStudent(student[0]);
		ss.addStudent(student[1]);
		ss.addStudent(student[2]);
		ss.addStudent(student[3]);
		System.out.println(ss.getAllStudent());
		System.out.println("*************************************************************************");
//		System.out.println(ss.getStudentById(1));
		ss.deleteStudent(4);
		System.out.println(ss.getAllStudent());
		System.out.println("*************************************************************************");
		ss.updateStudent(1);	
		System.out.println(ss.getAllStudent());
		
}
}

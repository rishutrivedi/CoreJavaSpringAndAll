package jdbcpractice.ui;

import java.util.Scanner;

import jdbcpractice.dto.Student;
import jdbcpractice.service.StudentService;
import jdbcpractice.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int ch,c;
	StudentService ss=new StudentServiceImpl();
	do {
		System.out.println("enter 1 for add");
		System.out.println("enter 2 for delete");
		System.out.println("enter 3 for update");
		System.out.println("enter 4 for getbyId");
		System.out.println("enter 5 for getallStudent");
		c=sc.nextInt();
	switch(c) {
	
	case 1:
		Student student =new Student("sachin","varanashi");
		System.out.println(ss.addStudent(student));
	    break;
	case 2:
		System.out.println(ss.deleteStudent(2)); 
		break;
	case 3:
		Student student1 =new Student(8,"ankita","delhi");
		System.out.println(ss.updateStudent(student1)); 
		break;
	case 4:
		System.out.println(ss.getStudentById(8)); 
		break;
	case 5:
		System.out.println(ss.getAllStudent());
		break;
	default:
		System.out.println("please enter valid number");
	}
	System.out.println("for repete enter 6");
	ch=sc.nextInt();
	}while(ch==6);
	sc.close();
	}
}

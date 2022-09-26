package Set;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		Set<Student>studentSet=new HashSet<Student>();
		studentSet.add(new Student("Anuj",2));
		studentSet.add(new Student("Ramesh",4));
		studentSet.add(new Student("Shivam",3));
		studentSet.add(new Student("Rohit",2));
		System.out.println(studentSet);
	}

}

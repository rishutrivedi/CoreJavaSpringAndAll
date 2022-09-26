package daysix.lists;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	// Set will not store duplicate elements
	public static void main(String[] args) {
		// HashSet does not allow duplicates
		// is an unsorted, unordered Set

		Set set = new HashSet();
		set.add("Hello");
		set.add(null);
		set.add("Hello");
		set.add(15);
		set.add(15.50);
		set.add(null);
		System.out.println(set);
		System.out.println("**********************************");
		Set<String> setOfStr = new HashSet<String>();
		setOfStr.add("Hello");
		setOfStr.add("Ayushi");
		setOfStr.add(null);
		setOfStr.add("Everyone");
		System.out.println(setOfStr);

		Student stud = new Student();
		stud.setStudentId(14);
		stud.setMarks(99.99);
		stud.setStudentName("Bob");

		Student stud1 = new Student();
		stud1.setStudentId(14);
		stud1.setMarks(99.99);
		stud1.setStudentName("Bob");

		Student stud2 = new Student();
		stud2.setStudentId(15);
		stud2.setMarks(98.99);
		stud2.setStudentName("Charlie");

		Set<Student> setOfStudent = new HashSet<Student>();
		setOfStudent.add(stud);
		setOfStudent.add(stud1);
		setOfStudent.add(stud2);

		System.out.println("*********************************");
		System.out.println(setOfStudent);

		// TreeSet- it does not allow duplicated
		// By default it elements will be in ascending order- Sorted Collection
		// Not Synchronized- if more than one thread wants to access it at the same
		// time, then it must be synchronized externally
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		System.out.println(treeSet);
	}

}
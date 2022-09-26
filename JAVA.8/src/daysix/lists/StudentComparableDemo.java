package daysix.lists;

import java.util.TreeSet;

public class StudentComparableDemo {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(new Student2(11,"Akash",99.50));
		treeSet.add(new Student2(12,"George",98.50));
		treeSet.add(new Student2(10,"Bob",85.50));
		treeSet.add(new Student2(9,"Charlie",99.99));
		
		System.out.println(treeSet);
	}

}
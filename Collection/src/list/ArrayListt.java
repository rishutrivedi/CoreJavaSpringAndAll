package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {
		ArrayList<Integer> studentName=new ArrayList<Integer>();
		studentName.add(1);
		studentName.add(2);
		studentName.add(3);
		studentName.add(4);
		studentName.add(5);
		System.out.println(studentName);
		studentName.add(2,6);
		System.out.println(studentName);
		ArrayList<Integer> student=new ArrayList<Integer>();
		student.add(7);
		student.add(8);
		student.add(9);
		student.add(10);
		student.add(11);
		studentName.addAll(student);
		System.out.println(studentName);
		studentName.remove(2);
		System.out.println(studentName);
		studentName.remove(Integer.valueOf(9));
		System.out.println(studentName);
		System.out.println(studentName.contains(11));
		studentName.set(3,25);
		System.out.println(studentName);
		for(int i=0;i<studentName.size();i++)
			System.out.print(studentName.get(i)+" ");
		System.out.println();
		Iterator<Integer> it=studentName.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
//		studentName.clear();
//		System.out.println(studentName);
	}

}

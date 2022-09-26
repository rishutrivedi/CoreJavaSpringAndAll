package list;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudent implements Comparable<SortStudent>{
	private String name;
	private Integer roll;
	
	public SortStudent(String name, Integer roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "SortStudent [name=" + name + ", roll=" + roll + "]";
	}
	@Override
	public int compareTo(SortStudent that) {
		if(this.roll==that.roll)
			return 0;
		else if (this.roll>that.roll)
		 return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
	ArrayList<SortStudent>list=new ArrayList<SortStudent>();
	list.add(new SortStudent("rishu",10));
	list.add(new SortStudent("shivam",5));
	list.add(new SortStudent("sachin",25));
	list.add(new SortStudent("tinku",13));
	list.add(new SortStudent("aman",35));
	list.add(new SortStudent("vaibhav",3));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	}

}

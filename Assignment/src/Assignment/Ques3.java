package Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		names.add("rishu");
		names.add("shivam");
		names.add("sachin");
		names.add("shashank");
		names.add("rohan");
		names.add("shashank");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name for search");
		String name=sc.nextLine();
        if(names.contains(name))
        	System.out.println("HELLO"+" "+name);
        else
        	System.out.println("name not found");
        sc.close();
	}

}

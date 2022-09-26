package Assignment;
import java.util.Scanner;
import java.util.ArrayList;

public class Ques1 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("rishu");
		names.add("shivam");
		names.add("sachin");
		names.add("shashank");
		names.add("rohan");
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

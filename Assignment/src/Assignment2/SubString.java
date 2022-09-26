package Assignment2;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int s=sc.nextInt();
	int e=sc.nextInt();
	for(int i=s;i<e;i++) {
		System.out.print(a.charAt(i));
	}
	sc.close();
	}

}

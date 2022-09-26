package Assignment;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter min and max value");
		int min=sc.nextInt();
		int max=sc.nextInt();
		double x=Math.random();
		System.out.println(x);
		if(x<min)
			System.out.println(min+x);
		else if(x>max)
			System.out.println(max-x);
		else
			System.out.println(x);
		sc.close();
	}

}

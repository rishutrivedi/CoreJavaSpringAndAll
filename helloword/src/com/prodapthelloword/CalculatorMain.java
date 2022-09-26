package com.prodapthelloword;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
	   double  x,y, value;
	   char c;
		Calculator  cal=new Calculator();
		do {
			System.out.println("enter 1 for sum and 2 for subtract 3 for multiply 4 for divison");
			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
		switch(a) {
		case 1:
				System.out.println("enter two number for adding");
				 x= sc.nextInt();
				 y= sc.nextInt();
				 value=cal.sum(x,y);
				 System.out.println(value);
				break;
		case 2:
			System.out.println("enter two number for subtract");
			x= sc.nextInt();
			y= sc.nextInt();
			 value=cal.subtract(x,y);
			 System.out.println(value);
			break;
		case 3:
			System.out.println("enter two number for multiply");
			x= sc.nextInt();
			y= sc.nextInt();
			 value=cal.multiply(x,y);
			 System.out.println(value);
			break;
		case 4:
			System.out.println("enter two number for divison ");
			x= sc.nextInt();
			y= sc.nextInt();
			 value=cal.divison(x,y);
			 System.out.println(value);
			break;	
		default:
			System.out.println("please press valid key");
			break;
			
		}
		System.out.println("for repeat the process write yes");	
		 c = sc.next().charAt(0);
		}while(c=='y'||c=='Y');
	}
	

}

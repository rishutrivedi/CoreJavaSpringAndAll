package arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declare an array
		int[] intArr;
		double[] doubleArr;
		double num = 1.0;
		
		doubleArr = new double[3];
		intArr = new int[5];
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[3] = 3;
		intArr[4] = 4;
		// intArr[5]=5;

		System.out.println(intArr);
		System.out.println(intArr.toString());
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println("***********************************");
		// intArr[5] --- 0 1 2 3 4
		// 1 2 3 4
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		for (int j = 0; j < doubleArr.length; j++) {

			doubleArr[j] = num;
			num++;
		}
		System.out.println("***************************");
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		System.out.println("***************************");
		int age[] = { 18, 17, 20, 25, 23 };

		System.out.println("***************************");
		for (int a : age) {
			System.out.println(a);
		}
		
		System.out.println("***************************");
		Person person = new Person();
		person.setPersonId(3);
		person.setPersonName("Trivedi");
		
		Person[] personArr = new Person[5];
		personArr[0]= new Person(1,"RaviShankar");
		personArr[1]= new Person(2,"Rishu");
		personArr[2]=person;
		personArr[3]= new Person(4,"Shivam");
		personArr[4]= new Person(5,"Yogita");
		//personArr[5]= new Person(6,"Chaturvedi");
		for (Person persn : personArr) {
			System.out.println(persn);
		}
		System.out.println("*************************************");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("*************************************");
		System.out.println(number);
		sc.close();
	}

}
package Array;

import java.util.Scanner;

public class NineTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		int n;
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		sc.close();
	}
}

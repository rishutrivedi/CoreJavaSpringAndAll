package Array;

import java.util.Scanner;

public class EvenValue {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);  
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
		sc.close();
	}

}

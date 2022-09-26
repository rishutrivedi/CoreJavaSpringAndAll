package arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/**
		int numbers[] = new int [10];
		int num = 10;
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=num;
			num--;
		}**/
		int numbers[] = {15,8,6,3,5,7};
		System.out.println(numbers);
		for(int n : numbers) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("*************************************");
		Arrays.sort(numbers);
		for(int n : numbers) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("*************************************");
		int nums[] = Arrays.copyOf(numbers, 6);
		for(int n : nums) {
			System.out.println(n);
		}
	}

}
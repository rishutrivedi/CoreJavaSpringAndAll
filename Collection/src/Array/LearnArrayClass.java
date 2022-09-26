package Array;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		int[] numbers= {10,23,9,4,55,6,7,8,98};
		int index=Arrays.binarySearch(numbers,5);
		System.out.println(index);
		Arrays.sort(numbers);
		for(int i:numbers)
			System.out.print(i+" ");
		System.out.println();
		Arrays.fill(numbers,12);
		for(int i:numbers)
			System.out.print(i+" ");
	}

}

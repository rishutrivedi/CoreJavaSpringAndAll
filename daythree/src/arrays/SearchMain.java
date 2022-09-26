package arrays;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ObjList[] objListArr = new ObjList[5];
		
		for(int index=0;index<objListArr.length;index++) {
			int number = sc.nextInt();
			objListArr[index]=new ObjList(number);
		}
		
		for(int i=0;i<objListArr.length;i++){
			System.out.println(objListArr[i]);
		}
		
		System.out.println("Enter the number you want to seacrh ---");
		int searchNumber = sc.nextInt();
		
		IntegerSearch integerSearch = new IntegerSearch();
		System.out.println(integerSearch.search(objListArr, new ObjList(searchNumber)));
		sc.close();
	}

}
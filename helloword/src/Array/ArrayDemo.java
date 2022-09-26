package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int num=1;
		for(int i=0;i<5;i++) {
			arr[i]=num;
			num++;
		}
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
		System.out.println("*******************************************************************");
		  }

}

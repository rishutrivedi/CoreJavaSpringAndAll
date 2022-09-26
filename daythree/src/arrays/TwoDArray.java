package arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int array2D[][] ;
		array2D= new int [rows][columns];
		System.out.println(array2D.length);
		System.out.println("*******************************");
		for(int row =0 ; row<array2D.length;row++) {
			for(int column =0;column< array2D.length;column++) {
				array2D[row][column] = row+1;
			}
		}
		
		for(int row =0 ; row<array2D.length;row++) {
			for(int column =0;column< array2D.length;column++) {
				  
				 System.out.println(array2D[row][column]);
			}
		}
	}
}
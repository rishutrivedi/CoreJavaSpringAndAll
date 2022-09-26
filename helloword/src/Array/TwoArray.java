package Array;

public class TwoArray {
	public static void main(String[] args) {
	int x,y;
	int[][] arr=new int[3][3];
	for(x=0;x<3;x++) {
		for(y=0;y<3;y++) {
			arr[x][y]=x+1;
		}
	}
	for(x=0;x<3;x++) {
		for(y=0;y<3;y++) {
			System.out.print(arr[x][y]);
		}
		System.out.println();
		}
}
}

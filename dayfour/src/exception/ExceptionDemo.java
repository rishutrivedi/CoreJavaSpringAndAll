package exception;

import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		//calling divide method
		divide(15, 0);
		divide(15, 2);

	}

	public static void divide(int x,int y){
		int ans;
		try {
		ans=x/y;
		System.out.println(ans);
		throw new FileNotFoundException();
		
		}catch(ArithmeticException ae){
//			ae.printStackTrace();
			System.out.println("You are dividing number by zero " + ae.getMessage());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("I am finally");
		}
		
	}

}
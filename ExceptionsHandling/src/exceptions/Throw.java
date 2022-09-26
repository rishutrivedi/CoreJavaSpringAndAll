package exceptions;

public class Throw {

	public static void main(String[] args) {
		int age=16;
		if(age<18) {
			throw new YoungerAgeException("you are not eligible");
		}
		else
		{
	System.out.println("please vote");
		}
	}

}

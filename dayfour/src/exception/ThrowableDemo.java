package exception;

import java.io.FileNotFoundException;

public class ThrowableDemo{

	public static void main(String[] args){
		try {
			proc();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}

	}
	
	static void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException fnfe) {
			System.out.println("Caught inside proc method");
			throw fnfe; //rethrow the exception
		}
	}

}
package io;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		//InputStream and OutputStream api or classes to perform IO in your program
		//InputStream to read data from source and OutputStream to write data to destination
	//Write a byte in a file
	 String word = "Good Morning everyone hope you had a wonderful weekend !";
	 try {
		FileOutputStream fos = new FileOutputStream("D:\\output\\prodapt\\output.txt");
		fos.write(68);
		fos.write(65);
		byte bArr[]= word.getBytes();
		fos.write(bArr);
		fos.close();
	 
	 } catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}
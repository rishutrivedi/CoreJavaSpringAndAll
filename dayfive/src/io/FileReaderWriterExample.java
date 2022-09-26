package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		/**FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\output\\writer.txt");
			fw.write("Hello Everyone Enjoy the class of Java");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}**/
		try {
			FileWriter fw;
			fw = new FileWriter("D:\\output\\prodapt\\writer.txt");

			fw.write("Hello Everyone Enjoy the class of Java");
			fw.close();
			
			FileReader fr = new FileReader("D:\\output\\prodapt\\writer.txt");
			int i=0;
			while ((i=fr.read()) !=-1){
				System.out.println((char) i);
			}
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
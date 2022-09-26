package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterExample {

	public static void main(String[] args) {
		//Writing the file 
		//FileWriter fw;
		try {
			FileWriter	fw = new FileWriter("D:\\output\\prodapt\\writeFile.txt");
		
		BufferedWriter buffWriter = new BufferedWriter(fw);
		buffWriter.write("Java's provide IO related libraries in java.io packages");
		buffWriter.close();
		fw.close();
		//Reading the file 
		FileReader fr = new FileReader("D:\\output\\prodapt\\writeFile.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
		
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
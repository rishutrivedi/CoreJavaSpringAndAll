package serilizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		 Employee e = new Employee();
		 e.setEmpId(11);
		 e.setEmpName("Rajesh");
		 
		 System.out.println(e);
		 
		 //Serialize an Object e 
		 //Write an object into a file system
		 File file = new File("D:\\output\\prodapt\\serializedObject.txt");
		 FileOutputStream fos;
		 try {
			 fos= new FileOutputStream(file);
			 ObjectOutputStream oos= new ObjectOutputStream(fos);
			 oos.writeObject(e);
			 oos.close();
			 fos.close();
		 }catch(FileNotFoundException fnfe) {
			 fnfe.printStackTrace();
		 }catch(IOException ioe) {
			 ioe.printStackTrace();
		 }
		 
		 //Deserialize
		 Employee emp;
		 try(FileInputStream fis = new FileInputStream(file);
			 ObjectInputStream ois = new ObjectInputStream(fis);	 
				 ){
		
				emp =  (Employee) ois.readObject();
				System.out.println("Deserialized object ----"+emp);
		
		 } catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		}

	}

}
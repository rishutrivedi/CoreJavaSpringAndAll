package Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		HashMap<String,String>credentials=new HashMap<String,String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter how many credential you want to store");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("enter"+j+"username");
			String user=sc.next();
			System.out.println("enter"+j+"password");
			String pass=sc.next();
			credentials.put(user, pass);
		}
		System.out.println("enter username to find");
		String usersearch=sc.next();
		if(credentials.containsKey(usersearch)) {
			System.out.println("contain username");
		}
		else
			System.out.println("dont containusername");
		
		 sc.close();
	}
}

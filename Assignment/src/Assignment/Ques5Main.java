package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques5Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many movie detail you want to store");
		int n=sc.nextInt();
		ArrayList<Ques5> store=new ArrayList<Ques5>();
		for(int i=0;i<n;i++){
		Ques5 obj = new Ques5();
		System.out.println("enter movie name");
		String moviename=sc.next();
		obj.setMovieName(moviename);
		System.out.println("enter hero name");
		String heroname=sc.next();
		obj.setHeroName(heroname);
		System.out.println("enter heroin name");
		String heroinname=sc.next();
		obj.setHeroinName(heroinname);
		System.out.println("enter year name");
		int year=sc.nextInt();
		obj.setYear(year);
		store.add(obj);
		}
		System.out.println("enter movie name");
		String m=sc.next();
		for(int i=0;i<store.size();i++) {
			if(store.get(i).getMovieName().equals(m)) {
				System.out.println(store.get(i).getHeroName());
				System.out.println(store.get(i).getHeroinName());
			}
		}
		 sc.close();
	}

}

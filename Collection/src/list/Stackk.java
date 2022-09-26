package list;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		Stack<String> animals=new Stack<String>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		animals.push("rat");
		animals.push("Cow");
		System.out.println(animals);
		System.out.println(animals.peek());
		System.out.println(animals.pop());
		System.out.println(animals);
	}

}

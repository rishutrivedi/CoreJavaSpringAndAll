package Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		Map<String,Integer>numbers=new HashMap<String,Integer>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		numbers.put("four",4);
		numbers.put("five",5);
		System.out.println(numbers);
		numbers.put("five",15);
		System.out.println(numbers);
		numbers.putIfAbsent("six",6);
		System.out.println(numbers);
		for(Map.Entry<String,Integer>e :numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getValue());
			System.out.println(e.getKey());
		}
	}

}

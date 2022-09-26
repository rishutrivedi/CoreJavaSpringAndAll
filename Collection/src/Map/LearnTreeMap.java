package Map;


import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

	public static void main(String[] args) {
		Map<String,Integer>numbers=new TreeMap<String,Integer>();
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
		numbers.remove("four");
		System.out.println(numbers);
	}

}

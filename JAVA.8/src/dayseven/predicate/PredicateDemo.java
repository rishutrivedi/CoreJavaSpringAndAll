package dayseven.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		List<Integer> lisOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		evaluate(lisOfInteger,(c)-> c%2==0);
		System.out.println("************************************");
		evaluate(lisOfInteger,(c)-> c%2!=0);

	}
	
	private static void evaluate(List<Integer>  listOfInteger, Predicate<Integer> predicate) {
		for(Integer number : listOfInteger) {
			if(predicate.test(number)) {
				System.out.println(number);
			}
		}
	}

}

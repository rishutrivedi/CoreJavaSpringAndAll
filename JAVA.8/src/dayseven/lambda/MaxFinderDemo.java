package dayseven.lambda;

import java.util.ArrayList;
import java.util.List;

public class MaxFinderDemo {

	public static void main(String[] args) {
		
		
		MaxFinder maxFinder=(num1,num2)->num1>num2?num1:num2;
		int max=maxFinder.maximum(10,20);
		System.out.println(max);
		
		List<String>curriencies=new ArrayList<String>();
		curriencies.add("USD");
		curriencies.add("rupees");
		curriencies.add("YUAN");
		curriencies.add("EURO");
		curriencies.add("KRON");
		curriencies.add("WAN");
		curriencies.add("TOMAN");
		curriencies.forEach(c-> System.out.println(c));
	}

}

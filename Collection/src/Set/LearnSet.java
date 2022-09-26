package Set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		System.out.println(set);
		set.add(1);
		System.out.println(set);
		set.remove(2);
		System.out.println(set);
		System.out.println(set.contains(7));
		System.out.println(set.contains(77));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
	}

}

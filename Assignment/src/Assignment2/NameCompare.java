package Assignment2;

import java.util.Comparator;

public class NameCompare implements Comparator<Tourist> {

	@Override
	public int compare(Tourist o1, Tourist o2) {

		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
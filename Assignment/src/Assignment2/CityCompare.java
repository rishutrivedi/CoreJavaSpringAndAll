package Assignment2;

import java.util.Comparator;

public class CityCompare implements Comparator<Tourist> {

	@Override
	public int compare(Tourist o1, Tourist o2) {
		
		return o1.getCity().compareToIgnoreCase(o2.getCity());
	}

}
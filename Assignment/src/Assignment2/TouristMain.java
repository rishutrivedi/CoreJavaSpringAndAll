package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TouristMain {

	public static void main(String[] args) {
		List<Tourist> list = new ArrayList<Tourist>();
		list.add(new Tourist(1, "Suraj", "Aligarh"));
		list.add(new Tourist(2, "Roop", "Greater Noida"));
		list.add(new Tourist(3, "Ravi", "Aligarh"));
		list.add(new Tourist(4, "Rohan", "New Delhi"));
		list.add(new Tourist(5, "Tinku", "Greater Noida"));
		list.add(new Tourist(6, "Yogesh", "Dadri"));	
		// display
		for (Tourist tour : list) {
			System.out.println(tour);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the City");
		String c = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCity().equals(c)) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("sort by name");
		Collections.sort(list, new NameCompare());
		System.out.println(list);
		
		System.out.println("sort by city");
		Collections.sort(list, new CityCompare());
		System.out.println(list);
		sc.close();
	}

}
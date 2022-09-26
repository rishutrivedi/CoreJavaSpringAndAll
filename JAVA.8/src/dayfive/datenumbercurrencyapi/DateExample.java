package dayfive.datenumbercurrencyapi;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("Our first date is : " + date1);

		Date date2 = new Date(99999999999L);

		System.out.println("Our second date is : " + date2);

		Date date3 = new Date(999999999999L);

		System.out.println("Our third date is : " + date3);

	}

}

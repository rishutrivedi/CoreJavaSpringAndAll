package dayeight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		Order order1 = new Order("AUD", 150000.00);
		Order order2 = new Order("INR", 5000.00);
		Order order3 = new Order("USD", 150000.00);
		Order order4 = new Order("EUR", 25000.00);
		Order order5 = new Order("AUD", 8000.00);
		Order order6 = new Order("EUR", 50000.00);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);

		orderList.stream().filter(o -> o.getAmount() > 10000).limit(2).forEach(System.out::println);
		orderList.stream().filter(o -> o.getAmount() > 10000).skip(2).forEach(System.out::println);

		// List of Integers
		List<Integer> listOfNumbers = Arrays.asList(15, 11, 10, 9, 12, 13, 2, 5, 8, 1, 7, 6, 4, 14, 16);
		listOfNumbers.stream() // source of stream
				.filter(num -> num > 3) // operation
				.limit(5) // restricting stream processing for the first 5 elements
				.forEach(System.out::println);//terminal operation
		
		
		System.out.println("***************************************");
		Stream<Integer> streams=listOfNumbers.stream();
		Stream<Integer> strm = streams.filter(num->num>10);//Intermediate operations return stream
		Stream<Integer> stm= strm.limit(5);//Intermediate operations return stream
		stm.forEach(System.out::println); //terminal operation
		
		
		System.out.println("***************************************");
		listOfNumbers.stream() //source of stream
					 .filter(num->num>10) //operation
					 .skip(5) //stream processing skipped for the first 5 elements
					 .forEach(System.out::println);
		
		System.out.println("*************Sort**************************");
		listOfNumbers.stream() //source of stream
					 .sorted() //operation //By default, it returns stream items in natural order
					 .forEach(System.out::println);

	}

}

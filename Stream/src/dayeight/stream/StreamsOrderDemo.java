package dayeight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOrderDemo {

	public static void main(String[] args) {
		System.out.println("***********************List of order streams example******************");
		Order order1 = new Order("AUD", 15000.00);
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

		orderList.stream()
				 .filter(o -> o.getAmount() > 5000.00)
				 .sorted(Comparator.comparing(Order::getAmount))
				 .forEach(System.out::println);
		
		System.out.println("******************Example of map() function*****************");
		List<String> words = Arrays.asList("Hello","stream","learning");
		words.stream().map(str->str.length()).forEach(System.out::println);
		
		List<Integer> counts = words.stream().map(str->str.length()).collect(Collectors.toList());
		System.out.println("***************************************************"+counts);
		counts.forEach(System.out::println);
		
		System.out.println("********************map() on orderList***********************");
		orderList.stream()
		          .filter(o->o.getCurrency().equals("EUR"))
		            .map(Order::getAmount)
		             .forEach(System.out::println);
		
		// Total order amount of all orders whose currency is EUR
		List<Double> orderAmounts = orderList.stream()
												.filter(o->o.getCurrency().equals("EUR"))
													.map(Order::getAmount).collect(Collectors.toList());
		System.out.println(orderAmounts);
		
		double totalAmount = orderList.stream()
										.filter(o->o.getCurrency().equals("EUR"))
											.map(Order::getAmount)
												.reduce(0.0,(x,y)->x+y);
		/**
		 * 2,3,5,6,10
		 * x,y->x+y
		 * x=2,y=3 -> 2+3=5
		 * x=5, y=6 -> 5+6=11
		 * x=11,y=10 -> 11+10=21
		 * 
		 */
		System.out.println(totalAmount);
		
		//Other Terminal Functions --- min(), max(), count()
				System.out.println("***********************min**************************");
				System.out.println(orderList.stream()
						.filter(o->o.getCurrency().equals("EUR"))
						.min(Comparator.comparing(Order::getAmount)));
				System.out.println("***********************max**************************");
				System.out.println(orderList.stream()
						.filter(o->o.getCurrency().equals("EUR"))
						.max(Comparator.comparing(Order::getAmount)));
				System.out.println("***********************count**************************");
				System.out.println(orderList.stream()
						.filter(o->o.getCurrency().equals("EUR"))
						.count());
	}

}

package dayseven.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		order order1=new order("AUD",15000.00);
		order order2=new order("DOLLAR",16000.00);
		order order3=new order("EURO",17000.00);
		order order4=new order("YEAN",18000.00);
		order order5=new order("CRON",19000.00);
		order order6=new order("TOMAN",20000.00);
		
		List<order> orderlist=new ArrayList<order>();
		orderlist.add(order1);
		orderlist.add(order2);
		orderlist.add(order3);
		orderlist.add(order4);
		orderlist.add(order5);
		orderlist.add(order6);
		
		System.out.println(orderlist);
		
		System.out.println("*************************************************");
		
		Collections.sort(orderlist,Comparator.comparing(order::getAmount));
		orderlist.forEach(System.out::print);
		
	    System.out.println("***************************************************");
	    
		
		Collections.sort(orderlist,Comparator.comparing(order::getCurrency));
		orderlist.forEach(System.out::print);
			Collections.sort(orderlist,new AmountComparator());	
				
		
		
	}

}

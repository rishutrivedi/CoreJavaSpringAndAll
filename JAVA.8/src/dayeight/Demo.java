package dayeight;

import java.util.ArrayList;
import java.util.List;
 
public class Demo {
 
    public static void main(String[] args) {
        Order order1= new Order("AUD",150000.00);
        Order order2 = new Order("INR",5000.00);
        Order order3 = new Order("USD",150000.00);
        Order order4 = new Order("EUR",25000.00);
        Order order5 = new Order("AUD",8000.00);
        Order order6 = new Order("EUR",50000.00);

        List<Order> orderList = new ArrayList<Order> ();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        orderList.stream().filter(o ->o.getAmount()>10000).limit(2).forEach(System.out::println);
        orderList.stream().filter(o ->o.getAmount()>10000).skip(2).forEach(System.out::println);
    }
 
}
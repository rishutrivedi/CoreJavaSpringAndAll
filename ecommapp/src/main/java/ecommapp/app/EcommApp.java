package ecommapp.app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import ecommapp.entities.Customer;
import ecommapp.entities.Order;
import ecommapp.entities.Product;
import ecommapp.service.EcommAppService;
import ecommapp.service.EcommAppServiceImpl;

public class EcommApp {
	public static void main(String[] args) {
		EcommAppService ecommservice=new EcommAppServiceImpl();
		
		//Create
		
		Customer customer=new Customer();
		customer.setName("Stefan Walker");
		customer.setTier(1);
//		ecommservice.addCustomer(customer);
		
		
//		
//		Product product=new Product();
//		product.setName("omnis quod consequatur");
//		product.setCategory("Games");
//		product.setPrice(184.83);
//		ecommservice.addProduct(product);
//		
		Order order=new Order();
		order.setStatus("NEW");
		order.setOrderDate(LocalDate.parse("2021-02-28"));
		order.setDeliveryDate(LocalDate.parse("2021-02-28"));
		order.setCustomer(customer);		
		Order order1=new Order();
		order1.setStatus("DELIVERED");
		order1.setOrderDate(LocalDate.parse("2021-03-28"));
		order1.setDeliveryDate(LocalDate.parse("2021-03-28"));
		order1.setCustomer(customer);	
		Set<Order> orderset=new HashSet<Order>();
		
		orderset.add(order1);
		orderset.add(order);
		customer.setOrder(orderset);
		
		ecommservice.addOrder(order);
		ecommservice.addOrder(order1);
//		ecommservice.addCustomer(customer);
		
	}
}

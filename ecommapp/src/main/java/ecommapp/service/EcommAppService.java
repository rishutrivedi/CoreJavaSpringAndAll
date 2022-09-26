package ecommapp.service;

import java.util.List;

import ecommapp.entities.Customer;
import ecommapp.entities.Order;
import ecommapp.entities.Product;



public interface EcommAppService {
	public void addCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();
	
	public Customer updateDepartment(Customer customer);
	
	public void deleteCustomer(long id);
	
    public void addProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(long id);
	
    public void addOrder(Order order);
	
	public List<Order> getAllOrder();
	
	public Order updateOrder(Order order);
	
	public void deleteOrder(int id);
}

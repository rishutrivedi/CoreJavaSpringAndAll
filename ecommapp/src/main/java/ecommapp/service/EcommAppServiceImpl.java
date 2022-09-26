package ecommapp.service;

import java.util.List;

import ecommapp.dao.EcommAppDAO;
import ecommapp.dao.EcommAppDAOImpl;
import ecommapp.entities.Customer;
import ecommapp.entities.Order;
import ecommapp.entities.Product;

public class EcommAppServiceImpl implements EcommAppService {
	
	EcommAppDAO ecommappdao=new EcommAppDAOImpl();
	
	public void addCustomer(Customer customer) {
		
		ecommappdao.addCustomer(customer);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer updateDepartment(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub

	}

	public void addProduct(Product product) {
		ecommappdao.addProduct(product);

	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(long id) {
		// TODO Auto-generated method stub

	}

	public void addOrder(Order order) {
		ecommappdao.addOrder(order);

	}

	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteOrder(int id) {
		// TODO Auto-generated method stub

	}

}

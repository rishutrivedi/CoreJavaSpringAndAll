package ecommapp.dao;

import java.util.List;

import org.hibernate.Session;

import ecommapp.entities.Customer;
import ecommapp.entities.Order;
import ecommapp.entities.Product;
import ecommapp.utility.HibernateUtility;


public class EcommAppDAOImpl implements EcommAppDAO {

	Session session = HibernateUtility.getSessionFactory().openSession();
	public void addCustomer(Customer customer) {
		session.beginTransaction();
		session.persist(customer);
		session.getTransaction().commit();

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
		session.beginTransaction();
		session.persist(product);
		session.getTransaction().commit();

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
		session.beginTransaction();
		session.persist(order);
		session.getTransaction().commit();
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

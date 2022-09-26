package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDAO;
import jdbcapp.dao.CustomerDAOImpl;
import jdbcapp.dto.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerdao=new CustomerDAOImpl();

	public Integer addCustomer(Customer customer) {
		
		return customerdao.addCustomer(customer);
	}

	public Customer getCustomerById(Integer customerId) {
		
		return customerdao.getCustomerById(customerId);
	}

	public List<Customer> getAllCustomers() {
		
		return customerdao.getAllCustomers();
	}

	public Integer updateCustomer(Customer customer) {
		
		return customerdao.updateCustomer(customer);
	}

	public Integer deleteCustomer(Integer customerId) {
	
		return customerdao.deleteCustomer(customerId);
	}
	public void addCustomerUsingSP(Customer customer) {
		
		 customerdao.addCustomerUsingSP(customer);
		
	}

}

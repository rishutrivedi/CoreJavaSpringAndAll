package service;

import java.util.List;

import daynine.dao.CustomerDAO;
import daynine.dao.CustomerDAOImpl;
import daynine.dto.Customer;
import daynine.exceptions.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao = new CustomerDAOImpl();
	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
	
		return customerDao.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Customer customer) {
		
		return null;
	}

	@Override
	public String deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
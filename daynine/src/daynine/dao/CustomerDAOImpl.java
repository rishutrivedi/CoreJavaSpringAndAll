package daynine.dao;

import java.util.ArrayList;
import java.util.List;

import daynine.dto.Customer;
import daynine.exceptions.CustomerNotFoundException;

public class CustomerDAOImpl implements CustomerDAO {
	private static List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	@Override
	public Customer addCustomer(Customer customer) {
		listOfCustomers.add(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
		for(Customer customer : listOfCustomers) {
			if(customer.getCustomerId() == customerId) {
				return customer;
			}
		}
		throw new CustomerNotFoundException();
		
	}

	@Override
	public List<Customer> getCustomers() {
		
		return listOfCustomers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
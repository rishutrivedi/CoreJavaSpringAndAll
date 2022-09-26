package jdbcapp.service;

import java.util.List;

import jdbcapp.dto.Customer;

public interface CustomerService {
	//CRUD- Create,Retrieve, Update and Delete operation
			//Create
			public Integer addCustomer(Customer customer);
			
			//Retrieve
			public Customer getCustomerById(Integer customerId);
			
			//Retrieve all customers
			public List<Customer> getAllCustomers();
			
			//Update
			public Integer updateCustomer(Customer customer);
			
			//Delete
			public Integer deleteCustomer(Integer customerId);
			//Call Stored Procedure
			public void addCustomerUsingSP(Customer customer);
}

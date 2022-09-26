package daynine.ui;


import daynine.dto.Customer;
import daynine.exceptions.CustomerNotFoundException;
import service.CustomerServiceImpl;


public class MainApp {

	public static void main(String[] args) {
		Customer cust = new Customer(1, "Sparsh", "Cawnpore");
		Customer cust1 = new Customer(2, "Suraj", "Aligarh");
		Customer cust2 = new Customer(3, "Rehan", "Dehradun");

		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.addCustomer(cust);
		customerService.addCustomer(cust1);
		customerService.addCustomer(cust2);
		System.out.println(customerService.getCustomers());
		try {
			System.out.println(customerService.getCustomerById(6));
		} catch (CustomerNotFoundException e) {

			System.out.println("No customer with given id is found");
		}
	}

}

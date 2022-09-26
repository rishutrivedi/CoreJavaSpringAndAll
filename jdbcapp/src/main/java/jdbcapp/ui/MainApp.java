package jdbcapp.ui;

import java.time.LocalDate;

import jdbcapp.dto.Customer;
import jdbcapp.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		CustomerServiceImpl customerService=new CustomerServiceImpl();
//		System.out.println(customerService.getAllCustomers());
		Customer customer1 =new Customer(2,"neha sharma",LocalDate.of(1991,05,15),9999999998L,"n@gmail");
		System.out.println(customerService.addCustomer(customer1));
//		System.out.println(customerService.getCustomerById(1));
//		System.out.println(customerService.deleteCustomer(1));
//		Customer customer2 =new Customer(2,"rishu",LocalDate.of(1992,05,15),9994545999L,"r@gmail");
//		System.out.println(customerService.updateCustomer(customer2));
//		Customer customer1 = new Customer(11,"Anushka Sharma",LocalDate.of(1991, 10, 15),9999113311L,"anushka.sharma@gmail.com");
//		customerService.addCustomerUsingSP(customer1);
	}

}			

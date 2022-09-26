package springscopes.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springscopes.bean.CustomerService;

public class Driver {

	public static void main(String[] args) {
		//read the config file and create context
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");

		CustomerService cs=context.getBean("customerService",CustomerService.class);
		cs.setCustomerName("Rishu");
		System.out.println(cs.getCustomerName());
		CustomerService cs1=context.getBean("customerService",CustomerService.class);
		System.out.println(cs1.getCustomerName());
	}

}

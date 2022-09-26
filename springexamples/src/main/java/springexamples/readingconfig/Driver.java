package springexamples.readingconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//configure metadata
		String springConfigurationFile="springconfig.xml";
		
		//installing a spring ioc container
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(springConfigurationFile);
		
		//here using context.getbean method we are trying to get an 
		Customer cust=context.getBean("customer",Customer.class);
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getAddress().getCity());
		System.out.println("*****************************************************************");
		//Person and its dependent beans
				Person person = context.getBean("personBean",Person.class);
				System.out.println(person.getResidentialAddress().getCity());
				System.out.println(person.getPermanentAddress().getCity());
				System.out.println(person.getAdharCardNumber());
				context.close();
	}
}

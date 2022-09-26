package springexampleswithannotation.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexampleswithannotation.model.Address;
import springexampleswithannotation.model.Customer;
import springexampleswithannotation.model.Person;

public class Driver {

	public static void main(String[] args) {
		//configure metadata
				String springConfigurationFile="springconfig-annotations.xml";
				
				//installing a spring ioc container
				AbstractApplicationContext context=new ClassPathXmlApplicationContext(springConfigurationFile);
				
				//here using context.getbean method we are trying to get an 
				Address resiAdd=context.getBean("addressBean1",Address.class);
				System.out.println(resiAdd.getCity());
				Customer cust=context.getBean("customer",Customer.class);
				System.out.println(cust.getCustomerName());
				Person personBean=context.getBean("person",Person.class);
				System.out.println(personBean.getPersonName());
						context.close();
	}

}

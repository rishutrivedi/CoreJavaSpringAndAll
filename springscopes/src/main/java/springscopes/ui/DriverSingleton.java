package springscopes.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springscopes.bean.CustomerSingleton;

public class DriverSingleton {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");

		CustomerSingleton cs=context.getBean("customerSingleton",CustomerSingleton.class);
		cs.setCustomerName("Rishu");
		System.out.println(cs.getCustomerName());
		CustomerSingleton cs1=context.getBean("customerSingleton",CustomerSingleton.class);
		System.out.println(cs1.getCustomerName());

	}

}

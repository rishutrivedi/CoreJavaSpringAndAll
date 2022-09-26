package autowire.byname;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.bytype.Employee;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springconfig-annotations.xml");
		Employee cust=context.getBean("employee",Employee.class);
		System.out.println(cust.getName());

	}

}

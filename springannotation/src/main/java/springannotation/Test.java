package springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springannotation/springconfig-annotations.xml");
		Address abc=context.getBean("address",Address.class);
		System.out.println(abc.getCity());
		
	}

}

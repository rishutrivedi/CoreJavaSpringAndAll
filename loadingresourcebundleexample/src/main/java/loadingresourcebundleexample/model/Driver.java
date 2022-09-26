package loadingresourcebundleexample.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-hello.xml");

		HelloWorld cs=context.getBean("helloBean",HelloWorld.class);
		System.out.println(cs.getMessage1());
		System.out.println(cs.getMessage2());

	}

}

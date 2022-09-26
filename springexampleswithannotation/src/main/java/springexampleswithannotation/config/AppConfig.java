package springexampleswithannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springexampleswithannotation.model.Address;
import springexampleswithannotation.model.Customer;
import springexampleswithannotation.model.Person;

@Configuration
public class AppConfig {
	@Bean
	public Customer createCustomer() {
		return new Customer();
		
	}
	@Bean(name="person")
	public Person createPerson() {
		return new Person();
	}
	@Bean(name="addressBean1")
	public Address createResidentialAddress() {
		return new Address();
	}
	
}

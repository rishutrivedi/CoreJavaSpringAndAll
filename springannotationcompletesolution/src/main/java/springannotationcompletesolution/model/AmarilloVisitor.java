package springannotationcompletesolution.model;

import org.springframework.stereotype.Component;

@Component
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	
	public AmarilloVisitor() {
		System.out.println("created Amarillo visitor");
		this.name = "Joe Bob";
		this.greeting = "Howdy";
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	public String getGreeting() {
		// TODO Auto-generated method stub
		return greeting;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
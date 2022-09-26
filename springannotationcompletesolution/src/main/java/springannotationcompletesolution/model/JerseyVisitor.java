package springannotationcompletesolution.model;

import org.springframework.stereotype.Component;

@Component
public class JerseyVisitor implements Visitor {
	private String name;
	private String greeting;
	
	
	public JerseyVisitor() {
		System.out.println("created Jersey visitor");
		this.name = "Bruce Springsteen";
		this.greeting = "Glory Days";
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
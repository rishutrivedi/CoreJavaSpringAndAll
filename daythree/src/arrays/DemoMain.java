package arrays;

public class DemoMain {

	public static void main(String[] args) {
		Demo demo = new Demo();
		//Calling the method displayInfo
		demo.displayInfo();
		//Decalred a variable to recieve the result when displayMessage is called
	    String message;
	     //Calling the method displayMessage and it will String object or value 
	    message = demo.displayMessage();
	    System.out.println(message);
	    
	    Integer result = demo.addition(15, 10);
	    System.out.println(result);
	    
	    System.out.println(""+"");
	}

}
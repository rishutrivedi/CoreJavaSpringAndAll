package arrays;

public class Demo {
	
//	Access Modifier Return Type MethodName()
	public void displayInfo() {
		//Logical Statement
		System.out.println("Good Morning Everyone");
	}

	public String displayMessage() {
		return "Hello I am returning";
	}
	
	//Below method is expecting two numbers and returning the result
	public Integer addition(Integer number1, Integer number2) {
		Integer result = number1+number2;
		
		return result;
	}
}
package dayseven.lambda;

public class LambdaExampleDemo {

	public static void main(String[] args) {
	LambdaExample lambdaExample= ()->"HEllo please dont talk";
	System.out.println(lambdaExample  instanceof LambdaExample);
	System.out.println(lambdaExample.fun());
	}

}

package com.prodapthelloword;

public class Calculator {
	public double sum(double a,double b) {
		return a+b;
	}
	public double subtract(double a,double b) {
		return a-b;
	}
	public double multiply(double a,double b) {
		return a*b;
	}
	public double divison(double a,double b) {
		if(a>b)
			return a/b;
		else
			return 0;
	}
	public static void main(String[] args) {
		

	}

}

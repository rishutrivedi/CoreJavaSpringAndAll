package com.prodapthelloword;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.displayEmloyeeDetails();
		
		Employee emp=new Employee(1,"Rathi",null,"Associate",null,50000.00);
		emp.displayEmloyeeDetails();
		System.out.println("**************************************************************");
		emp.setDesignation("SrAssociate");
		emp.displayEmloyeeDetails();
		System.out.println("**************************************************************");
		emp.displayEmloyeeDetails();
		double incrSal= emp.increaseSalary(.5,emp.getSalary());
		emp.displayEmloyeeDetails();
		System.out.println("**************************************************************");
		emp.setSalary(incrSal);
		emp.displayEmloyeeDetails();
		
	}

}

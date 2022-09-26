package com.prodapthelloword;

import java.time.LocalDate;

public class Employee {
		private int empId;
		private String empName;
		private LocalDate dateofbirth;
		private String designation;
		private LocalDate dateofjoining;
		private double salary;
		
		public Employee() {
			
		}
       public Employee(int empId,String empName,LocalDate dateofbirth,String designation,LocalDate dateofjoining,double salary) {
    	   this.empId=empId;
    	   this.empName=empName;
    	   this.dateofbirth=dateofbirth;
    	   this.designation=designation;
    	   this.dateofjoining=dateofjoining;
    	   this.salary=salary;
		}
		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public LocalDate getDateofbirth() {
			return dateofbirth;
		}

		public void setDateofbirth(LocalDate dateofbirth) {
			this.dateofbirth = dateofbirth;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public LocalDate getDateofjoining() {
			return dateofjoining;
		}

		public void setDateofjoining(LocalDate dateofjoining) {
			this.dateofjoining = dateofjoining;
		}

		public void displayEmloyeeDetails() {
			System.out.println(empId+" "+empName+" "+dateofbirth+" "+designation+" "+dateofjoining+" "+salary);
		}
		public double getSalary()
		{
			return this.salary;
		}
		public void setSalary(double incrSal)
		{
			 this.salary=incrSal;
		}
		public double increaseSalary(double percentage,double salary) {
			double increasedSalary=(1+percentage)*salary;
			return increasedSalary;
		}

}

package jpaapp.entities;

public class Employee {
private  Integer id;
private String firstName;
private String lastName;
private double salary;

private Department department;

public Employee() {
	super();
}

public Employee(Integer id, String firstName, String lastName, double salary) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
			+ ", department=" + department + "]";
}


}

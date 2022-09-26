package autowire.byname;

import autowire.bytype.Address;

public class Employee {
private String name;
private Address address;
private Address address2;
public Employee(String name, Address address, Address address2) {
	super();
	this.name = name;
	this.address = address;
	this.address2 = address2;
}
public Employee() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Address getAddress2() {
	return address2;
}
public void setAddress2(Address address2) {
	this.address2 = address2;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", address2=" + address2 + "]";
}

}


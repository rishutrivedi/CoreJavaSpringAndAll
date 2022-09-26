package springexamples.dependencyinjection;

public class Customer {
 private Integer customerId;
 private String customerName;
 private IAddress iaddress;

public Customer(IAddress iaddress) {
	this.iaddress = iaddress;
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public IAddress getIaddress() {
	return iaddress;
}
public void setIaddress(IAddress iaddress) {
	this.iaddress = iaddress;
}
}

package springscopes.bean;

public class CustomerSingleton {
private String customerName;


public String getCustomerName() {
	return customerName;
}


public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


@Override
public String toString() {
	return "CustomerSingleton [customerName=" + customerName + "]";
}


public void init() {
	
}
}

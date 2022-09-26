package springscopes.bean;

public class CustomerService {
private String customerName;

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

@Override
public String toString() {
	return "CustomerService [customerName=" + customerName + "]";
}
public void init() {
	
}
}

package ecommapp.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {

private String name;
private Integer tier;

@OneToMany(mappedBy = "customer")//inverse
private Set<Order> order;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long customer_id;


public Customer() {
	super();
}
public Customer(int id,String name, Integer tier) {
	super();
	this.customer_id = id;
	this.name = name;
	this.tier = tier;
}

public Set<Order> getOrder() {
	return order;
}
public void setOrder(Set<Order> order) {
	this.order = order;
}
public long getId() {
	return customer_id;
}

public void setId(long id) {
	this.customer_id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getTier() {
	return tier;
}

public void setTier(Integer tier) {
	this.tier = tier;
}

@Override
public String toString() {
	return "Customer [id=" + customer_id+ ", name=" + name + ", tier=" + tier + "]";
}
}

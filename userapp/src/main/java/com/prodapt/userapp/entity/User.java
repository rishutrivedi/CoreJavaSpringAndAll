package com.prodapt.userapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userId;
private String userName;
private String password;
private boolean isActivated;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="role_id")
private Role role;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id")
private UserDetails userDetails;

public User(Long userId, String userName, String password, boolean isActivated, Role role, UserDetails userDetails) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
	this.isActivated = isActivated;
	this.role = role;
	this.userDetails = userDetails;
}

public User() {
	super();
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isActivated() {
	return isActivated;
}

public void setActivated(boolean isActivated) {
	this.isActivated = isActivated;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public UserDetails getUserDetails() {
	return userDetails;
}

public void setUserDetails(UserDetails userDetails) {
	this.userDetails = userDetails;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", isActivated="
			+ isActivated + ", role=" + role + ", userDetails=" + userDetails + "]";
}




}

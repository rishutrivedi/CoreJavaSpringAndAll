package com.project.restfulapp.exceptions;

import org.springframework.stereotype.Component;

@Component
public class EmployeeNotFoundException extends Exception{
    String message;
    Long id;
	public EmployeeNotFoundException(String message, Long id) {
		super();
		this.message = message;
		this.id = id;
	}
	public EmployeeNotFoundException() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmployeeNotFoundException [message=" + message + ", id=" + id + "]";
	}
	public EmployeeNotFoundException(Long id) {
		super("Could not find employee "+id);
	}
	public EmployeeNotFoundException(String name) {
		super("Could not find employee by "+name);
	}
}
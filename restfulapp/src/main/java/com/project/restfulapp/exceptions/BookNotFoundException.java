package com.project.restfulapp.exceptions;

import org.springframework.stereotype.Component;

@Component
public class BookNotFoundException extends Exception{
	private String message;

	public BookNotFoundException(String message) {
		super();
		this.message = message;
	}

	public BookNotFoundException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
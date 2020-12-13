package com.example.demo.exceptions;

public class CheckException extends Exception {
	private String message;

	public CheckException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
}

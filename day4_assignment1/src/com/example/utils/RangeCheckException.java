package com.example.utils;
import java.lang.*;

public class RangeCheckException extends Exception{
	private String message ;
	
	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	
}

package com.example.demo.services;

import com.example.demo.Professor;

public class PaymentService {
	
	//protected double calculateSalary(Professor prof) {
		
		public double calculateSalary(Professor prof) {
		
		double salary = 50000.00;
		
		if(prof.getQualification().equals("PG")) {
			salary = 60000.00;
		}
		
		else if(prof.getQualification().equalsIgnoreCase("phd")) {
			salary=75000.00;
		}
		
		
		return salary;
	}
	
	public double calculateSalary(String qualification) {
		
		String key = qualification.toUpperCase();
		
		//Switch case with key as string , before java 7 it was only int or char
		switch (key) {
		case "PG": {
			
			return 60000.00;
		}
		case "PHD":
			return 75000.00;
		default:
			return 50000.00;
			
		}
	}

}

package com.example.demo.model;

public class Loan {
	
	
	int cibilScore;
	
	
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}

	public Loan(int cibilScore) {
		this.cibilScore=cibilScore;
	}
	
	
	
	

	

	public double findRateOfInterest() {
		 double rateOfInterest = 8.2;
		
		if(this.cibilScore>500) {
			rateOfInterest = 7.5;
		}
		
		return rateOfInterest;
	}
}

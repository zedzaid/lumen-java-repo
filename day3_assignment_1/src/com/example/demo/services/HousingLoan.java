package com.example.demo.services;

import com.example.demo.model.Loan;

public class HousingLoan extends Loan{
	private double loanAmount;
	private double Time;
	
	
	public HousingLoan() {
		// TODO Auto-generated constructor stub
	}
	
	


	public HousingLoan(double loanAmount, double time) {
		super();
		this.loanAmount = loanAmount;
		Time = time;
	}




	public HousingLoan(int cibilScore,double loanAmount,double Time) {
		super(cibilScore);
		// TODO Auto-generated constructor stub
		
		this.loanAmount=loanAmount;
		this.Time=Time;
	}
	
	public double getInterestAmount() {
		double interestAmount=0;
		interestAmount = ((this.loanAmount)*(this.Time)*(super.findRateOfInterest()))/100;
		return interestAmount;
	}

	

	
}

package com.example.demo.model;

public class BusinessAccount extends BankAccount {
	
	private String businessType;
	
	

	public BusinessAccount(long accountNumber, String accountHolder, double currentBalance, String businessType) {
		super(accountNumber, accountHolder, currentBalance);
		this.businessType = businessType;
	}

	@Override
	public double deposit(double amount) {
		double currentBalance = getCurrentBalance();
		double clearBalance=currentBalance;
		if(amount<=1000000) {
			clearBalance=currentBalance+amount;
			setCurrentBalance(clearBalance);
		}
		else {
			System.out.println("You cannot deposit more than 1000000 at a time!");
		}
		return clearBalance;
	}

	@Override
	public double withdraw(double amount) {
		double currentBalance = getCurrentBalance();
		double clearBalance=currentBalance ;
		if(currentBalance==25000) {
			System.out.println("you cannot withdraw any money from the account as your balance is 25000");
		}
		else if(currentBalance-amount<25000) {
			System.out.println("You cannot withdraw this amount as your minumum balance must be minumum of 25000\n"
					+ "try withdrawing amount less than "+(currentBalance-25000));
		}
		else {
			clearBalance = currentBalance-amount;
			System.out.println("Rs "+amount+" is withdrawn successfully\n"
					+ "your current balance is "+clearBalance);
			setCurrentBalance(clearBalance);
		}
		
		return clearBalance;
	}

}

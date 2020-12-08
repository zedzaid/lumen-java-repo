package com.example.demo.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	
	

	public SavingsAccount(long accountNumber, String accountHolder, double currentBalance, String nominee) {
		super(accountNumber, accountHolder, currentBalance);
		this.nominee = nominee;
	}

	@Override
	public double deposit(double amount) {
		double currentBalance = getCurrentBalance();
		double clearBalance=currentBalance;
		if(amount<=100000) {
			clearBalance = currentBalance + amount;
			setCurrentBalance(clearBalance);
		}
		else {
			System.out.println("You cannot deposit more than 100000");
		}
		
		
		
		return clearBalance;
	}

	@Override
	public double withdraw(double amount) {
		double currentBalance = getCurrentBalance();
		double clearBalance= currentBalance;
		if(currentBalance==5000) {
			System.out.println("you cannot withdraw any money from the account as your balance is 5000");
		}
		else if(currentBalance-amount<5000) {
			System.out.println("You cannot withdraw this amount as your minumum balance must be minumum of 5000\n"
					+ "try withdrawing amount less than "+(currentBalance-5000));
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

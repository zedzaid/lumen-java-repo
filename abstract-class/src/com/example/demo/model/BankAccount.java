package com.example.demo.model;

public abstract class BankAccount {
	
	private long accountNumber;
	private String accountHolder;
	private double currentBalance;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	//we still cant instantiate because the class is abstract
	public BankAccount(long accountNumber, String accountHolder, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.currentBalance = currentBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	
	
	

}

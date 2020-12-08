package com.example.demo;

import com.example.demo.model.BankAccount;
import com.example.demo.model.BusinessAccount;
import com.example.demo.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new SavingsAccount(9833,"Ramesh",1000,"nalini");
		
		account.deposit(50000000);
		account.deposit(15000);
		
		BankAccount account2 = new BusinessAccount(9544,"Suresh",10000,"zed");
		
		account2.deposit(1100000);
		account2.deposit(50000);
		account2.withdraw(26000);
		account2.withdraw(20000);
		
		System.out.println("Current Balance is "+account2.getCurrentBalance());

	}

}

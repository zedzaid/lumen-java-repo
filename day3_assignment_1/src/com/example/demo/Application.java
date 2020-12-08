package com.example.demo;

import java.util.Scanner;

import com.example.demo.services.HousingLoan;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to XYZ Bank ");
		System.out.println("=======================");
		
		System.out.println("Housing Loan DashBoard");
		
		System.out.println("Enter the customers Cibils Score");
		
		Scanner scanner =  new Scanner(System.in);
		
		int cibilScore = scanner.nextInt();
		
		System.out.println("Enter the Loan Amount ");
		
		double loanAmount = scanner.nextDouble();
		
		System.out.println("Enter the time (in years) to clear the debt");
		
		double time = scanner.nextDouble();
		
		HousingLoan loan1 = new HousingLoan(cibilScore,loanAmount,time);
		
		System.out.println("Interest amount for  "+loanAmount+" for "+time+" years is "+loan1.getInterestAmount());

		scanner.close();
	}

}

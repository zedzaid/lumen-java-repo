package com.example.demo.apps;

import com.example.demo.Professor;
import com.example.demo.services.PaymentService;
import java.util.*;
import static java.lang.Math.*;

public class FlowControlApplication {
	
	public static double houseLoan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor prof = new Professor(101,"ramesh","CS","PG");
		
		PaymentService service  = new PaymentService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the qualification");
		
		String qualification = sc.next();
		
		
		double phdSalary = service.calculateSalary(qualification);
		
		double pgSalary = service.calculateSalary(prof);
		
		System.out.println(qualification+" Salary := "+phdSalary);
		System.out.println("PG Salary is := "+pgSalary);
		
		sc.close();
		
	}
	
	public static void showHousingLoan() {
		System.out.println(houseLoan);
		
		System.out.println(sqrt(4));
	}

}

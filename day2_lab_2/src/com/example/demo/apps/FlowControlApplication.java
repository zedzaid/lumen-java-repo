package com.example.demo.apps;

import com.example.demo.Professor;
import com.example.demo.services.PaymentService;

public class FlowControlApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor prof = new Professor(101,"ramesh","CS","PG");
		
		PaymentService service  = new PaymentService();
		
		double phdSalary = service.calculateSalary("phd");
		
		double pgSalary = service.calculateSalary(prof);
		
		System.out.println("PHD Salary := "+phdSalary);
		System.out.println("PG Salary is := "+pgSalary);
		
	}

}

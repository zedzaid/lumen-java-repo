package com.example.demo;

import com.example.demo.models.Advocate;
import com.example.demo.models.Plumber;
import com.example.demo.models.SoftwareEngineer;
import com.example.demo.services.BillService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftwareEngineer employee1 = new SoftwareEngineer("Lumen",5,500000);
		Plumber employee2 = new Plumber("FreeLancer",300000);
		Advocate employee3 = new Advocate("Level 2",750000);
		
		BillService service = new BillService();
		
		System.out.println("our new Salary for Software Engineer is ");
		service.printBill(employee1);
		
		System.out.println("our new Salary for Plumber is ");
		service.printBill(employee2);
		
		System.out.println("our new Salary for Advocate is ");
		service.printBill(employee3);
	}

}

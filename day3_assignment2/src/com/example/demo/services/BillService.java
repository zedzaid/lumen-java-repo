package com.example.demo.services;

import com.example.demo.ifaces.Billable;

public class BillService {
	
	public void printBill(Billable bill) {
		System.out.println(bill.calculate());
	}

}

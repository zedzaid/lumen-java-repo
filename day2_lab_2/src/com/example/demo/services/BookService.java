package com.example.demo.services;

import com.example.demo.Book;

public class BookService {
	
	public double calculateDiscount(Book b) {
		double discount = 20.00;
		
		if(b.getPrice()>1000) {
			discount = 200.00;
		}
		else if(b.getPrice()>500) {
			discount=100.00;
		}
		else if(b.getPrice()>200) {
			discount = 50.00;
		}
		
		return discount;
	}
	
	public double calculateDiscount(Book b, String customer) {
		
		double discount = 20.00;
		
		if(b.getPrice()>1000) {
			discount = 200.00;
		}
		else if(b.getPrice()>500) {
			discount=100.00;
		}
		else if(b.getPrice()>200) {
			discount = 50.00;
		}
		
		customer = customer.toLowerCase();
		
		if(customer.equals("corporate")) {
			discount+=50.00;
			
		}
		else if(customer.equals("retail")){
			discount+=100.00;
		}
		
		return discount;
	}
	
}

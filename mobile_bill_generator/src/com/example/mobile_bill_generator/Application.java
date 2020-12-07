package com.example.mobile_bill_generator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//testing with zero arguments constructor
		Customer ramesh = new Customer();
		
		System.out.println(ramesh.getCustomerName());
		System.out.println(ramesh.getCustomerNumber());
		System.out.println(ramesh.getPlanName());
		System.out.println(ramesh.getPlanBill());
		System.out.println(Customer.serviceProvider);
		
		
		//testing with all arguments constructor
				Customer suresh = new Customer("suresh","9754934212","standard",399.00);
				
				System.out.println(suresh.getCustomerName());
				System.out.println(suresh.getCustomerNumber());
				System.out.println(suresh.getPlanName());
				System.out.println(suresh.getPlanBill());
				System.out.println(Customer.serviceProvider);
				
	   //testing with 3 arguments
				Customer paresh = new Customer("paresh","9754235212","standard");
				System.out.println(paresh.getCustomerName());
				System.out.println(paresh.getCustomerNumber());
				System.out.println(paresh.getPlanName());
				System.out.println(paresh.getPlanBill());
				System.out.println(Customer.serviceProvider);
				
				paresh.setCustomerName("paresh Kumar");
				paresh.setPlanName("premium");
				
				
		

	}

}

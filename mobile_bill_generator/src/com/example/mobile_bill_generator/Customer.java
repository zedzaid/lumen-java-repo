package com.example.mobile_bill_generator;

public class Customer {
	
	private String customerName;
	private String customerNumber;
	private String planName;
	private double planBill;
	
	public static String serviceProvider= "Airtel";

	
	//constructor with zero aruguments
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	//constructor with all the arguments
	public Customer(String customerName, String customerNumber, String planName, double planBill) {
		super();
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.planName = planName;
		this.planBill = planBill;
	}

	//constructor with just 3 arguments
	public Customer(String customerName, String customerNumber, String planName) {
		this(customerName,customerNumber,planName,599.00);
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.planName = planName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getPlanName() {
		return planName;
	}

	public double getPlanBill() {
		return planBill;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public void setPlanBill(double planBill) {
		this.planBill = planBill;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
	
	
	

}

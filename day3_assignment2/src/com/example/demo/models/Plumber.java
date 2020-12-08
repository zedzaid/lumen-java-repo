package com.example.demo.models;

import com.example.demo.ifaces.Billable;

public class Plumber implements Billable {
	private String workType;
	private double salary;
	
	

	public Plumber() {
		// TODO Auto-generated constructor stub
	}

	
	


	public Plumber(String workType, double salary) {
		super();
		this.workType = workType;
		this.salary = salary;
	}




	public String getWorkType() {
		return workType;
	}





	public void setWorkType(String workType) {
		this.workType = workType;
	}





	public double getSalary() {
		return salary;
	}





	public void setSalary(double salary) {
		this.salary = salary;
	}





	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.salary+(this.salary*30)/100;
	}

}

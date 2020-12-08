package com.example.demo.models;

import com.example.demo.ifaces.Billable;

public class SoftwareEngineer implements Billable {
	private String companyName;
	private double experience;
	private double salary;
	
	

	public SoftwareEngineer() {
		// TODO Auto-generated constructor stub
	}


	

	public SoftwareEngineer(String companyName, double experience, double salary) {
		super();
		this.companyName = companyName;
		this.experience = experience;
		this.salary = salary;
	}

	
	



	public String getCompanyName() {
		return companyName;
	}




	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}




	public double getExperience() {
		return experience;
	}




	public void setExperience(double experience) {
		this.experience = experience;
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
		return this.salary+(this.experience/3);
	}

}

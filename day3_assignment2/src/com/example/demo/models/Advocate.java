package com.example.demo.models;

import com.example.demo.ifaces.Billable;

public class Advocate implements Billable {
	private String level;
	private double salary;
	
	

	public Advocate() {
		// TODO Auto-generated constructor stub
	}

	

	public Advocate(String level, double salary) {
		super();
		this.level = level;
		this.salary = salary;
	}

	


	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
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
		double hikePercentage=0;
		if(this.level.equalsIgnoreCase("level 1")) {
			hikePercentage=20;
		}
		else if(this.level.equalsIgnoreCase("level 2")) {
			hikePercentage=40;
		}
		else {
			hikePercentage=50;
		}
		return this.salary+hikePercentage/100;
	}

}

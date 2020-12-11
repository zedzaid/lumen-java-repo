package com.example.demo.model;

public class BloodDonor {
	private int id;
	private String name;
	private int age;
	private String bloodGroup;
	public BloodDonor() {
		// TODO Auto-generated constructor stub
	}
	public BloodDonor(int id, String name, int age, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "BloodDonor [id=" + id + ", name=" + name + ", age=" + age + ", bloodGroup=" + bloodGroup + "]";
	}
	
	

}

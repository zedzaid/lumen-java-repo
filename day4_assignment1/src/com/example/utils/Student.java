package com.example.utils;

public class Student {
	
	/*
	 * The lines below defined are instance variables
	 * Instance variables have default values - 0, 0.0, null, false
	 * They can be used without assignment
	 */
	private int rollNumber;
	private String studentName;
	private double markScored;
	
	//class variable with static keyword - they have default value
	
	public static String trainerName = "javgal";
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, double markScored) throws RangeCheckException  {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		if(markScored<0 || markScored>100) {
			throw new RangeCheckException("marks scored should be in range of 0 to 100");
		}
		else {
			this.markScored=markScored;
		}
		
		
	}
	public Student(int rollNumber, String studentName) throws RangeCheckException {
		
		//overloaded constructor (rajesh example)
		this(rollNumber,studentName,99);
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setMarkScored(double markScored)  {
		try {
			if(markScored<0 || markScored>100) {
				throw new RangeCheckException("marks scored should be in range of 0 to 100");
			}
			else {
				this.markScored = markScored;
			}
		}
		catch(RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getMarkScored() {
		return markScored;
	}
	
	
	public String assignGrade() {
		
		//local variable 
		String grade = "o";
		
		/*
		 * Local variable cannot be used without initialization unlike class variable or instance variable
		 * They cannot have any modifier like private, protected
		 * 
		 * 
		 * 
		 * this below commented code doest work 
		 * 
		 * string grade;
		 * system.out.println(grade)
		 * 
		 * this above code gives error because grade was not initialized*/
		
		if(this.markScored<80) {
			grade="A";
		}
		
		return grade;
	}
	
	
	
}

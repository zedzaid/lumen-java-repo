package com.example.utils;

public class Application {
	
	//autoboxing example where the method uses object Double and if we pass primitive double we dont
	//get any errors . Here is where autoboxing comes into picutre
	// Its introduced in java v8
	public static Double checkScholarship(Double markScored) {
		
		Double amount =50000.00D;
		if(markScored<70) {
			amount=35000.00D;
		}
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram = new Student();
		
		System.out.println(ram.getMarkScored());
		System.out.println(ram.getRollNumber());
		System.out.println(ram.getStudentName());
		System.out.println(Student.trainerName);
		
		
		Student ramesh=null;
		try {
			ramesh = new Student(101,"ramesh",67);
		} catch (RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		
		System.out.println(ramesh.getMarkScored());
		System.out.println(ramesh.getRollNumber());
		System.out.println(ramesh.getStudentName());
		
		System.out.println(ramesh.assignGrade());
		
		
		
		Student rajesh=null;
		try {
			rajesh = new Student(102,"rajesh");
		} catch (RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println(rajesh.getMarkScored());
		System.out.println(rajesh.getRollNumber());
		System.out.println(rajesh.getStudentName());
		
		System.out.println(rajesh	.assignGrade());
		
		
		//upcasting -- in this no casting is required as we are casting from low to high
		byte rno = 103;
		
		Student manish = new Student();
		
		manish.setRollNumber(rno);
		manish.setStudentName("Manish");
		manish.setMarkScored(104);
		
		
		
		System.out.println(manish.getMarkScored());
		System.out.println(manish.getRollNumber());
		System.out.println(manish.getStudentName());
		
		System.out.println(manish.assignGrade());
		
		
		//casting -- downcasting as byte is less than int we have to cast it
		int iroll = 4;
		byte broll =(byte) iroll;
		
		int rollNumber = Integer.parseInt("105"); //parsing string represantation of number from string to int
		double markScored  = Double.parseDouble("303");
		
		Student rishi=null;
		try {
			rishi = new Student(rollNumber,"manoj",markScored);
		} catch (RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		//System.out.println(rishi.assignGrade());
		
		//autoBoxing example as im passing primitive double but method is accepting Object Double
		//System.out.println(checkScholarship(rishi.getMarkScored()));
		
	}

}

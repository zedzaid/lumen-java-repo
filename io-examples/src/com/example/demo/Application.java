package com.example.demo;

import java.io.*;
import com.example.demo.service.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("professor.ser");
		
		File textfile = new File("professor.txt");

		ProfessorService service = new ProfessorService();
		
		int key = 4;
		
		if(key==1) {
			Professor prof = new Professor(3838,"suresh","ece","phd");
			Professor prof2 = new Professor(3838,"mahesh","iem","phd");
			Professor prof3 = new Professor(3838,"ramesh","ise","pg");
			Professor professors[] = {prof,prof2,prof3};
			boolean result = service.writeObjectToFile(file, professors);
			
			if(result) {
				System.out.println("one object srialized");
			}
			else {
				System.out.println("Check - Exception");
			}
		}
		
		if(key==2) {
			
			Professor prof[] = (Professor[])service.readObjectFromFile(file);
			
			if(prof!=null) {
				for(Professor eachProfessor : prof) {
				System.out.println(eachProfessor.getQualification());
				}
			}
			else {
				System.out.println("check - Exception");
			}
		}
		
		if(key==3) {
			
			Professor suresh = new Professor(3838,"suresh","ece","phd");
			Professor manish = new Professor(2838,"manish","mech","pg");
			
			
			System.out.println("is added"+service.writeToTextFile(manish, textfile));
			System.out.println("is added"+service.writeToTextFile(suresh, textfile));
		}
		
		if(key==4) {
			Professor[] list = service.readFromTextFile(textfile);
			
			for(Professor eachProf : list) {
				if(eachProf!=null) {
					System.out.println(eachProf);
				}
			}
		}
		
	}
	
	

}

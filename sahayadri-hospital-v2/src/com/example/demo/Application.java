package com.example.demo;

import java.util.*;

import com.example.demo.exceptions.CheckException;
import com.example.demo.models.*;
import com.example.demo.services.*;

public class Application {
	
	public static void printDoctors(List<Doctor> doctors) {
		int count=1;
		for(Doctor eachDoctor : doctors) {
			System.out.println((count++)+" "+eachDoctor.getDoctorName());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int doctorId;
		String qualifications;
		int patientId;
		int age;
		String gender;
		int count;
		int selectDoctor;
		String date;
		boolean exitLoop=true;
		int option;
		try {
			Patient patient1 = new Patient("surabhi",101,27,"female");
			Patient patient2 = new Patient("samruddhi",102,31,"female");
			patientId = 103;
			HashMap<String,List<Patient>> patients = new HashMap<>();
			List<Patient> patientList = new ArrayList<Patient>();
			patientList.add(patient1);
			patientList.add(patient2);
			patients.put("13/12/2020", patientList);
			Doctor doctor1 = new Doctor("kalyan", 101, "MBBS MS", patients);
			doctorId=101;
			List<Doctor> totalDoctors = new ArrayList<Doctor>(); 
			totalDoctors.add(doctor1);
			HospitalService service = new HospitalService();
			
			
			
			while(exitLoop) {
				System.out.println("Welcome to the syahadri hospital");
				System.out.println("Select from the menu :");
				System.out.println("1. Add Doctor\n2.Add Appointment\n3.Remove Appointment\n4.Get Doctor's patients by date\n5.Get all Patients by Doctors\n6.close the app");				
				option = Integer.parseInt(scanner.nextLine());
				switch (option) {
				case 1: 
					System.out.println("Enter the doctor name");
					name = scanner.nextLine();
					System.out.println("enter the doctor Id");
					doctorId = Integer.parseInt(scanner.nextLine());
					System.out.println("enter the doctors qualifications");
					qualifications = scanner.nextLine();
					HashMap<String,List<Patient>> doctorPatients = new HashMap<>();
					service.addDoctor(totalDoctors, new Doctor(name,doctorId,qualifications,doctorPatients));
					break;
				
				case 2: 
					System.out.println("enter the patient name");
					String patientName = scanner.nextLine();
					System.out.println("enter patient Id");
					patientId = Integer.parseInt(scanner.nextLine());
					System.out.println("enter the patient's age");
					age = Integer.parseInt(scanner.nextLine());
					System.out.println("enter the gender");
					gender = scanner.nextLine();
					System.out.println("choose from the below doctors");
					printDoctors(totalDoctors);
					selectDoctor = Integer.parseInt(scanner.nextLine());
					Doctor patientsDoctor = totalDoctors.get(selectDoctor-1);
					System.out.println("Enter the date");
					date = scanner.nextLine();
					service.addPatient(patientsDoctor, new Patient(patientName, patientId, age, gender), date);
					break;
				case 3:
					System.out.println("enter your patient Id");
					int deletePatientId = Integer.parseInt(scanner.nextLine());
					System.out.println("choose from the list of doctors where appointment is booked");
					printDoctors(totalDoctors);
					selectDoctor = Integer.parseInt(scanner.nextLine());
					Doctor selDoctor = totalDoctors.get(selectDoctor-1);
					System.out.println("Enter the date to be sorted");
					date = scanner.nextLine();
					service.cancelAppointment(selDoctor, deletePatientId, date);
					
					break;
				case 4:
					System.out.println("choose from the list of doctors whose patients has to be viewed");
					printDoctors(totalDoctors);
					selectDoctor = Integer.parseInt(scanner.nextLine());
					Doctor doctor = totalDoctors.get(selectDoctor-1);
					System.out.println("Enter the date to be filtered");
					date = scanner.nextLine();
					List<Patient> sortedPatients=service.getPatientsOfDoctorByDate(doctor, date);
					if(sortedPatients.isEmpty()) {
						System.out.println("No patients found for the given filter");
					}
					else {
						for(Patient eachPatient : sortedPatients) {
							System.out.println(eachPatient.getPatientName());
						}
					}
					
					break;
				case 5:
					System.out.println("select the doctor from the given list");
					printDoctors(totalDoctors);
					selectDoctor = Integer.parseInt(scanner.nextLine());
					Doctor findDoctorsPatients = totalDoctors.get(selectDoctor-1);
					List<Patient> patientsByDoctor = service.getPatientsByDoctor(findDoctorsPatients);
					if(patientsByDoctor.isEmpty()) {
						System.out.println("No Patients have appointment with the doctor");
					}
					else {
						for(Patient eachPatient : patientsByDoctor) {
							System.out.println(eachPatient.toString());
						}
					}
					break;
				case 6:
					exitLoop=false;
					break;
				}
			}
			
			
		} 
		catch (CheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}

}

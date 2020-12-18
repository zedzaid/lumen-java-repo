package com.example.demo.services;

import java.util.*;

import com.example.demo.exceptions.CheckException;
import com.example.demo.models.Doctor;
import com.example.demo.models.Patient;

public class HospitalService {

	//adds a new doctor to an existing list of all doctors in the hospital
	public void addDoctor(List<Doctor> doctors,Doctor doctor) {
		doctors.add(doctor); //doctors is a list maintained for all doctors
		System.out.println("new doctor added successfully!");
		
	}
	
	/*
	 * method to add a new patient to the doctor 
	 * doctor object has a map of date as key and list of patients as value
	 * this method also throws a checkException if patients object is null or empty*/
	public void addPatient(Doctor doctor, Patient patient,String date) throws CheckException {
			HashMap<String,List<Patient>> patients = doctor.getPatients();//gets the existing hashmap of that particular doctor object
			
			if(patients.containsKey(date)) {						
				List<Patient> daysPatients = patients.get(date);
				
				if(daysPatients.size()==10) {
					System.out.println("slots for today for this doctor is full/n please take an appointment tomorrow");
					
				}
				else {
					daysPatients.add(patient);
					patients.put(date, daysPatients);
					doctor.setPatients(patients);
					System.out.println("Patient added successfully");
					
				}
			}
			else {
				List<Patient> daysPatients = new ArrayList<>();
				daysPatients.add(patient);
				patients.put(date, daysPatients);
				doctor.setPatients(patients);
				System.out.println("Patient added successfully");
				
			}
			
			
		}
	
	
	//returns a list of patients associated with a doctor by date
	public List<Patient> getPatientsOfDoctorByDate(Doctor doctor,String date) throws CheckException{
		HashMap<String,List<Patient>> patientsByDate= doctor.getPatients();
		if(patientsByDate.containsKey(date)) {
		List<Patient> patients = patientsByDate.get(date);
		return patients;
		}
		else {
			
			return new ArrayList<Patient>();
		}
	}
	
	
	//returns a list of patients associated to the doctor
	public List<Patient> getPatientsByDoctor(Doctor doctor){
		List<Patient> totalPatients = new ArrayList<Patient>();
		HashMap<String,List<Patient>> patients= doctor.getPatients();
		Set<Map.Entry<String, List<Patient>>> setView = patients.entrySet();
		for(Map.Entry<String, List<Patient>> eachDate : setView) {
			for(Patient eachPatient : eachDate.getValue()) {
				totalPatients.add(eachPatient);
			}
		}
		return totalPatients;
	}
	
	
	
	//this method fetches the list of patient from doctor and removes the patient from list
	public void cancelAppointment(Doctor doctor, int patientId,String date) {
		
			HashMap<String,List<Patient>> patients = doctor.getPatients();
			List<Patient> patientsByDate= patients.get(date);
			for(Patient eachPatient : patientsByDate) {
				if(eachPatient.getPatientId()==patientId) {
					patientsByDate.remove(eachPatient);
					patients.put(date, patientsByDate);
					System.out.println("appointment cancelled successfully");
					
				}
			}
			
		
	
	}
}

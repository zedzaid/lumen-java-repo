package com.example.demo.services;

import java.util.*;

import com.example.demo.exceptions.CheckException;
import com.example.demo.models.Doctor;
import com.example.demo.models.Patient;

public class HospitalService {

	public void addDoctor(List<Doctor> doctors,Doctor doctor) {
		doctors.add(doctor);
		System.out.println("new doctor added successfully!");
		
	}
	
	public void addPatient(Doctor doctor, Patient patient,String date) throws CheckException {
			HashMap<String,List<Patient>> patients = doctor.getPatients();
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

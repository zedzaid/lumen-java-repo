package com.example.demo.models;

import com.example.demo.exceptions.CheckException;
import com.example.demo.ifaces.Hospital;

public class Patient implements Hospital{
	private String patientName;
	private int  patientId;
	private int patientAge;
	private String gender;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, int patientId, int patientAge, String gender) throws CheckException {
		super();
		if(patientName==null || patientName.isEmpty()) {
			throw new CheckException("patient name cannot be empty/null.\n please enter a valid patient name");
		}
		else {
			this.patientName = patientName;
		}
		this.patientId = patientId;
		this.patientAge = patientAge;
		if(gender==null || gender.isEmpty()) {
			throw new CheckException("patient gender cannot be empty/null.\n please enter a valid patient gender");
		}
		else {
			this.gender = gender.toLowerCase();
		}
		
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) throws CheckException {
		this.patientName = patientName;if(patientName==null || patientName.isEmpty()) {
			throw new CheckException("patient name cannot be empty/null.\n please enter a valid patient name");
		}
		else {
			this.patientName = patientName;
		}
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) throws CheckException {
		if(gender==null || gender.isEmpty()) {
			throw new CheckException("patient gender cannot be empty/null.\n please enter a valid patient gender");
		}
		else {
			this.gender = gender.toLowerCase();
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.gender == null) ? 0 : this.gender.hashCode());
		result = prime * result + patientAge;
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (this.gender == null) {
			if (other.gender != null)
				return false;
		} else if (!this.gender.equals(other.gender))
			return false;
		if (patientAge != other.patientAge)
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", patientAge=" + patientAge
				+ ", Gender=" + this.gender + "]";
	}
	@Override
	public String getDepartmentName() {
		return "Patients";
	}

}

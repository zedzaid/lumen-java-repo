package com.example.demo.models;

import java.util.*;

import com.example.demo.exceptions.CheckException;
import com.example.demo.ifaces.Hospital;

public class Doctor implements Hospital {
	private String doctorName;
	private int doctorId;
	private String qualifications;
	private HashMap<String,List<Patient>> patients;
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, int doctorId, String qualifications, HashMap<String,List<Patient>> patients) throws CheckException {
		super();
		if(doctorName==null || doctorName.isEmpty()) {
			throw new CheckException("Doctor's name cannot be empty/null.\n please provide a valid input");
		}
		else {
			this.doctorName = doctorName;
		}
		if(qualifications==null || qualifications.isEmpty()) {
			throw new CheckException("qualifications cannot be empty/null.\n please provide a valid input");
		}
		else {
			this.qualifications = qualifications;
		}
		
		if(patients==null) {
			throw new CheckException("there must be atleast one patient having to attend this doctor\n please add atleast one patient");
		}
		else {
			this.patients = patients;
		}
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) throws CheckException {
		if(doctorName.isEmpty() || doctorName==null) {
			throw new CheckException("Doctor's name cannot be empty/null.\\n please provide a valid input");
		}
		else {
			this.doctorName=doctorName;
		}
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) throws CheckException {
		if(qualifications==null || qualifications.isEmpty()) {
			throw new CheckException("qualifications cannot be empty/null.\n please provide a valid input");
		}
		else {
			this.qualifications = qualifications;
		}
	}
	public HashMap<String,List<Patient>> getPatients() {
		return patients;
	}
	
	public void setPatients(HashMap<String,List<Patient>> patients) throws CheckException {
		if(patients==null) {
			throw new CheckException("there must be atleast one patient having to attend this doctor\n please add atleast one patient");
		}
		else {
			this.patients = patients;
		}
	}
	

	
	
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", qualifications=" + qualifications
				+ ", patients=" + patients + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + doctorId;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((patients == null) ? 0 : patients.hashCode());
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorId != other.doctorId)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (patients == null) {
			if (other.patients != null)
				return false;
		} else if (!patients.equals(other.patients))
			return false;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		return true;
	}
	@Override
	public String getDepartmentName() {
		return "Doctors";
	}

}

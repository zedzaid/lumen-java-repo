package com.example.demo;

import java.util.*;

import com.example.demo.model.BloodDonor;

public class Application {

	public static void main(String[] args) {
		
		HashMap<String,List<BloodDonor>> bloodDonors = new HashMap<>();
		
		BloodDonor donor1 = new BloodDonor(101,"mahesh",25,"aneg");
		BloodDonor donor2 = new BloodDonor(102,"ramesh",25,"bpos");
		BloodDonor donor3 = new BloodDonor(103,"suresh",26,"aneg");
		
		List<BloodDonor> anegDonors = Arrays.asList(donor1,donor3);
		List<BloodDonor> bposDonors = Arrays.asList(donor2);
		
		bloodDonors.put("aneg", anegDonors);
		bloodDonors.put("bpos", bposDonors);
		
		Set<Map.Entry<String, List<BloodDonor>>> setView = bloodDonors.entrySet();
		
		for(Map.Entry<String, List<BloodDonor>> eachGroup : setView) {
			System.out.println("Donors having blood group as "+eachGroup.getKey());
			for(BloodDonor donor : eachGroup.getValue()) {
				System.out.println(donor.toString());
			}
		}
		
	}

}

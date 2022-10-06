package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
	protected ArrayList<String> patientNotes;
	
	protected Physician(Integer id){
		super(id);
	}
	
	public boolean assignPin(int pin) {
		this.setPin(pin);
		if(pin <= 999 || pin >= 9999) {
			return false;
		} else {
			return true;
		}
	}
	
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(this.getId() != confirmedAuthID) {
    		return false;
    	} else {
    		return true;
    	}
    }
	
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
}

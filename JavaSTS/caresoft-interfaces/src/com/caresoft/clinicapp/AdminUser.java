package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    
    
    public AdminUser(Integer id, String role) {
		super(id);
		this.setEmployeeID(id);
	}

    
	//--------user---------
    public boolean assignPin(int pin) {
    	this.setPin(pin);
    	if(pin <= 99999) {
    		return false;
    	} else {
    		return true;
    	}  	
    }
    
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	ArrayList<String> list = new ArrayList<String>();
    	if(this.getEmployeeID() != confirmedAuthID) {
    		this.setSecurityIncidents(list);
    		authIncident();
    		authIncident();
    		authIncident();
    		authIncident();
    		authIncident();
    		return false;
    	} else {
    		return true;
    	}
    }
    
    //---------administrator-----------
    
    public ArrayList<String> reportSecurityIncidents(){
    	return this.getSecurityIncidents();	
    }
    
    //---------methods-----------
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    //-------getters and setters-----------
    
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
    
    
}

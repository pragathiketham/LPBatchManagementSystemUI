package com.virtusa.model;

import java.util.Date;

public class LpDetailsModel {

	  private String lpId;
	    private String firstName;
	    private String lastName;
	    private String phoneNumber;
	    private Date dob;
	    private String email;
	    private String designation;
	    private String city;
	    private String state;
	    private String country;
	    public String getLpId() {
	        return lpId;
	    }
	    public void setLpid(String lpId) {
	        this.lpId = lpId;
	    }
	    public Date getDob() {
	        return dob;
	    }
	    public void setDob(Date dob) {
	        dob = dob;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstname(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastname(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    public void setPhonenumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
}

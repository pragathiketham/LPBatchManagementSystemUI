package com.virtusa.otomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	   @Id  
	    @GeneratedValue(strategy=GenerationType.TABLE)    
	private int employeeId;    
	private String name,email;    
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="qid")  
	@OrderColumn(name="type")  
	private List<Address> address; 
	
	
	public int getEmployeeId() {  
	    return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
	    this.employeeId = employeeId;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public List<Address> getAddress() {  
	    return address;  
	}  
	public void setAddress(List<Address> address) {  
	    this.address = address;  
	}    
	  
}

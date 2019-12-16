package com.virtusa.otoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Address {
	private int addressId;    
private String city,state,country;    
   
  
private Employee employee;  
public int getAddressId() {  
    return addressId;  
}  
public void setAddressId(int addressId) {  
    this.addressId = addressId;  
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
public Employee getEmployee() {  
    return employee;  
}  
public void setEmployee(Employee employee) {  
    this.employee = employee;  
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", country=" + country
			+ ", employee=" + employee + "]";
} 


}  



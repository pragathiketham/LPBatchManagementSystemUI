package com.virtusa.otoone;


import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {

	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  	}

	
	public void addEmployee(Employee e) {
	    template.save(e); 
		System.out.println("Employee saved successfully, Employee Details="+e);
	}

	
	public void updateEmployee(Employee e){  
	    template.update(e);  
	    System.out.println("Employee saved successfully, Employee Details="+e);
	}  
	//method to delete employee  
	public void deleteEmployee(Employee e){  
	    template.delete(e);  
	    System.out.println("Employee deleted successfully, Employee Details="+e);
	}  
	//method to return one employee of given id  
	public Employee getById(int id){  
	    Employee e =(Employee)template.get(Employee.class,id);  
	    return e;  
	}
	public void addAddress(Address a) {
	    template.save(a); 
		System.out.println("Address saved successfully, address Details="+a);
	}

	
	public void updateAddress(Address a){  
	    template.update(a);  
	    System.out.println("Address saved successfully, address Details="+a);
	}  
	//method to delete employee  
	public void deleteEmployee(Address a){  
	    template.delete(a); 
	    System.out.println("Employee deleted successfully, Employee Details="+a);
	}  
	//method to return one employee of given id  
	public Address getByaddId(int id){  
		Address a =(Address)template.get(Address.class,id);  
	    return a;  
	}

}
				
	



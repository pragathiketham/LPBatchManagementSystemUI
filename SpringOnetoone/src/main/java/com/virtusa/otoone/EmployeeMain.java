package com.virtusa.otoone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao=(EmployeeDao) context.getBean("d");
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setName("pragathi");
		e.setEmail("pagf@gmail.com");
		
		
		dao.addEmployee(e);
	}

}

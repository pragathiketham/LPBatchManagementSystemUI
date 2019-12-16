package com.virtusa.otomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("");
	}

}

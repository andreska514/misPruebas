package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		// without Spring:
		// Employee eRef = new Employee();
		// eRef.eid = 101;
		// eRef.ename = "John Watson";
		// eRef.address = "Redwood Shores";
		// eRef.gender = 'M';
		
		//Spring - IOC (Inversion of Control)
		// you dont create  objects.
		// Objects shall be configured in an xml file by the developer.
		// Spring Container -> responsible to contruct the java objects by parsing xml file
		
		
	}
}

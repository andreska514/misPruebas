package com.example.demo;

public class Client {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("John Watson");
		e.setAddress("Redwood Shores");
		
		System.out.println("Employee Details:\n"+e);
		
		// Spring way - IOC
		Resource resource new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource); // Spring container which shall parse xml file and construct the objects
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee e2 = factory.getBean("emp2", Employee.class);
		
		System.out.println("");
	}
}

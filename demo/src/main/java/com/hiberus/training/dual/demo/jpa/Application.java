package com.hiberus.training.dual.demo.jpa;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/*	@SpringBootApplication =
 * 		  @Configuration:	tags the class as a source of bean definitions 
 * 				for the application context.
 * 		+ @EnableAutoConfiguration: tells Spring Boot to start adding beans based 
 * 				on classpath settings, other beans, and various property settings.
 * 		+ @EnableWebMvc:	Normally you would add @EnableWebMvc for a Spring 
 * 				MVC app, but Spring Boot adds it automatically when it sees 
 * 				spring-webmvc on the classpath. This flags the application as 
 * 				a web application and activates key behaviors such as 
 * 				setting up a DispatcherServlet
 * 		+ @ComponentScan:	tells Spring to look for other components, 
 * 				configurations, and services in the hello package, allowing it 
 * 				to find the controllers
 */
@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger (Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner demo (CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));
			
			// fetch all customers
			log.info ("");
			log.info ("Customers found with findAll():");
			log.info ("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info (customer.toString());
			}
			log.info("");
			
			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(consumer -> {
					log.info ("Customer found with findById(1L): ");
					log.info ("----------------------------------");
					log.info (consumer.toString());
					log.info ("");
				});
			
			// fetch customers by last name
			log.info ("Customer found with findByLastName('Bauer':");
			log.info ("-------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer ->{
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
			
		};
	}
	
}
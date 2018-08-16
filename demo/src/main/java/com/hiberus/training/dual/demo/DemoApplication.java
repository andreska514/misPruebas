package com.hiberus.training.dual.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hiberus.training.dual.demo.services.dto.Contact;
import com.hiberus.training.dual.demo.services.dto.ContactRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
	
	@Bean
	public CommandLineRunner demo (ContactRepository repository) {
		return (args) -> {
			repository.save(new Contact("Hector","Sanz"));
			repository.save(new Contact("Jorge","Perez"));
			repository.save(new Contact("Idoia","Castilla"));
			repository.save(new Contact("Manuel","Gracia"));
			repository.save(new Contact("Camilo","Pardo"));
			repository.save(new Contact("Jaime","Gonzalez"));
			
			System.out.println(repository.findAll().toString());
			
		};
	}
}

package com.hiberus.training.dual.demo.jpa;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

// <tipeEntity, tipeId>
// No necesita una clase que implemente estos métodos porque spring la crea al vuelo
@Component
public interface CustomerRepository extends CrudRepository <Customer, Long> {
	
	List <Customer> findByLastName (String lastName);

}

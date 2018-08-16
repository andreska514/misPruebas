package com.hiberus.training.dual.demo.services.dto;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository <Contact, Long> {
	List <Contact> findBySurname (String surname);
}

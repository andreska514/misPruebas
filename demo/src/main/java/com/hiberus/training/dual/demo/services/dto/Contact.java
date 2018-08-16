package com.hiberus.training.dual.demo.services.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data @Entity
public class Contact {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	
	protected Contact() {}
	
	public Contact(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Contact (Long id, String name, String surname) {
		if (!this.getId().equals(id)) {
			this.id = id;
			this.name = name;
			this.surname = surname;
		}
	}
}

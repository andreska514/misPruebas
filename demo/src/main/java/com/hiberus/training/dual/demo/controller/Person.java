package com.hiberus.training.dual.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private boolean active;
	private long id;
	private String name;
	private String surname;
	public List <Telefono> telefonos = new ArrayList<>();
	
	public Person(boolean active, long id, String name, String surname, List<Telefono> telefonos) {
		super();
		this.active = active;
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telefonos = telefonos;
	}

	public boolean isActive() {
		return active;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	
}

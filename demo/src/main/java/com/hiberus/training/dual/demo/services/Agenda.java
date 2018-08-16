package com.hiberus.training.dual.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hiberus.training.dual.demo.services.dto.Contact;
import com.hiberus.training.dual.demo.services.dto.ContactRepository;

@Component
public class Agenda {
	
	@Autowired
	private ContactRepository cr;
	
	private List <Contact> contactList = new ArrayList<>();;
	
	public Agenda() {
//		ContactList = new ArrayList<>();
	}
	
	public List<Contact> getContactList(){
		if (contactList.isEmpty()) {
			refreshList();
		}
		return contactList;
	}
	
	private void refreshList() {
		contactList.clear();
		for (Contact contact : cr.findAll()) {
			contactList.add(contact);
		}
	}
	
//	public void refreshDb() {
//		cr.deleteAll();
//		for (Contact contact : listaContactos) {
//			cr.save(contact);
//		}
//	}
	
	public void addContact (Contact contact) {
		if(!contactExist(contact)) {
			cr.save(contact);
			refreshList();
		}
	}
		
	public void delContact (Contact contact) {
		System.out.println("deleting "+contact.toString());
		cr.delete(contact);
		refreshList();
	}
	
	public boolean delContact (Long id) {
		for (Contact c:cr.findAll()) {
			if(c.getId().equals(id)) {
				cr.delete(c);
				refreshList();
				return true;
			}
		}
		return false;
	}
	
	public void editContact (Contact contact, Long id) {
//		delContact(id);
//		addContact(contact);
//		refreshList();
//		contactList.set(id, contact);
		Contact editar = cr.findById(id).get();
		editar.setName(contact.getName());
		editar.setSurname(contact.getSurname());
		refreshList();
	}
	
	public boolean contactExist(Contact contact) {
		for(Contact cont : contactList) {
			if(contact.getName().equals(cont.getName()) && 
					contact.getSurname().equals(cont.getSurname())) {
				System.out.println("El contacto ya existe");
				return true;
			}
		}
		return false;
	}
}

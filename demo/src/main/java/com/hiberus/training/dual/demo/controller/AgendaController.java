package com.hiberus.training.dual.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hiberus.training.dual.demo.services.Agenda;
import com.hiberus.training.dual.demo.services.dto.Contact;

@Controller
public class AgendaController {
	
	private Agenda agenda;
	private Long currentId;
	
	
	AgendaController (@Autowired Agenda agenda){
		this.agenda = agenda;
	}
// 	***************
//	*** /agenda ***
// 	***************
	@GetMapping ("/agenda")
	public ModelAndView listContacts() {
		ModelAndView result = new ModelAndView("contact/list");
		result.addObject("atrAgenda", agenda.getContactList());
		return result;
	}
// 	*******************
//	*** /agenda_add ***
// 	*******************
	@GetMapping ("/agenda_add")
	public String goToAdd() {
		return "contact/add";
	}
	@PostMapping ("/agenda_add")
	public String addContact(@ModelAttribute Contact contact) {
		if (contact.getName()!="" && contact.getSurname()!="") {
			agenda.addContact(contact);
		}
		return "redirect:/agenda";
	}
// 	*******************
//	*** /agenda_del ***
// 	*******************
	@GetMapping ("/agenda_del/{id}")
	public String delContact(@PathVariable String id) {
		agenda.delContact(Long.valueOf(id));
		return "redirect:/agenda";
	}
// 	********************
//	*** /agenda_edit ***
// 	********************
	@GetMapping("/agenda_edit/{id}")
	public ModelAndView goToEdit(@PathVariable String id) {
		ModelAndView result = new ModelAndView("/contact/edit");
		for(Contact contact : agenda.getContactList()) {
			if(contact.getId().equals(Long.valueOf(id))) {
				result.addObject("contact", contact);
			}
		}
		this.currentId = Long.valueOf(id);
		return result;
	}
	
	@PostMapping ("/agenda_edit")
	public String editContact(@ModelAttribute Contact contact) {
		if (contact.getName()!="" && contact.getSurname()!="") {
			agenda.editContact(contact, currentId);
		}
		return "redirect:/agenda";
	}	
}

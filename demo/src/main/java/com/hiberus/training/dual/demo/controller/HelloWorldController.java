package com.hiberus.training.dual.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	List<String> exampleList;
	List<Person> personList;

	// RequestMapping (method=GET) <-- antes 
	@GetMapping("/hello")
	public ModelAndView hello() {

		//genero las lista ejemplo y la de personas(con tlfs)
		generaListas();
		
		ModelAndView result = new ModelAndView("hello");

		// addObject (K,V) K: usado en los html
		result.addObject("helloWorld", "Hello World!!");
		result.addObject("title", "This is a title");
		result.addObject("user", "root");
		result.addObject("pass", "****");
		
		result.addObject("list", exampleList);

		result.addObject("personList", personList);
		return result;

		// return "hello.html";
	}

	@GetMapping("/goodbye")
	public String goodbye() {
		System.out.println("goodbye");
		return "goodbye.html";
	}
	
	/*
	 * Inicializa y rellena las listas:
	 * - exampleList
	 * - personList
	 */
	void generaListas() {

		// Lista de ejemplo
		exampleList = new ArrayList<>();
		exampleList.add("One");
		exampleList.add("Two");
		exampleList.add("Three");
		exampleList.add("Four");
		
		// Lista de personas (dentro de ella una de telefonos)
		List<Telefono> teleList1 = new ArrayList<>();
		List<Telefono> teleList2 = new ArrayList<>();
		List<Telefono> teleList3 = new ArrayList<>();
		List<Telefono> teleList4 = new ArrayList<>();
		teleList1.add(new Telefono("fijo", "987987987"));
		teleList1.add(new Telefono("movil", "687987987"));
		teleList1.add(new Telefono("empresa", "654654654"));
		teleList2.add(new Telefono("fijo", "787879878"));
		teleList2.add(new Telefono("movil", "666555444"));
		teleList3.add(new Telefono("fijo", "95647987"));
		teleList4.add(new Telefono("fijo", "978454812"));

		personList = new ArrayList<>();
		personList.add(new Person(true, 173l, "Jhon", "Mc", teleList1));
		personList.add(new Person(false, 122l, "Mike", "McG", teleList2));
		personList.add(new Person(false, 201l, "Harry", "Potter", teleList3));
		personList.add(new Person(false, 17l, "Jake", "Johnson", teleList4));
				
	}

	

}

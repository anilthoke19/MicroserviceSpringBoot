package user.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import user.example.entity.Contact;
import user.example.service.ContactSrevice;

@RestController

@RequestMapping("/contact")

public class ContactController {

	@Autowired
	ContactSrevice serv;
	
	@GetMapping("/home")
	public String MainPage()
	{
		return "Home Page";
	}
	
	@GetMapping("/new")
	public String NewAdd()
	{
		return "Add some method to check ";
	}
	
	@GetMapping("view/{id}")
	public List<Contact> getContactData(@PathVariable("id") Long id ) {
		
		return serv.getContact(id);
		
	}
	
	
	
}

package user.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import user.example.entity.Contact;

@Service
public class ContactSrevice {
	List<Contact> list=List.of(
			new Contact(1L,"anil@","Pune",1311L),
			new Contact(2L,"sunil@","Nanded ",1312L),
			new Contact(3L,"Manoj@","Hingoli",1311L)
			
			);
			
	
	public List<Contact> getContact(Long userId)
	{ 
		
		return list.stream().filter(cont->cont.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
}

package com.payflow.payflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payflow.payflow.dto.ResponseStructure;
import com.payflow.payflow.entity.Contact;
import com.payflow.payflow.service.ContactService;

@RestController
@RequestMapping("/payflow/Contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Contact>> addContact(@RequestBody Contact contact){
		return contactService.addContact(contact);
	}
	
	@GetMapping("/{contactId}")
	public ResponseEntity<ResponseStructure<Contact>> getContactById(@PathVariable Long contactId){
		return contactService.getContactById(contactId);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Contact>>> getAllContact(){
		return contactService.getAllContact();
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Contact>> updateContact(@RequestBody Contact contact){
		return contactService.updateContact(contact);
	}
	
	@DeleteMapping("/contactId/{contactId}")
	public ResponseEntity<ResponseStructure<Contact>> deleteContact(@PathVariable Long contactId){
		return contactService.deleteContact(contactId);
	}
}

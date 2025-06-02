package com.payflow.payflow.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.payflow.payflow.entity.ContactType;
import com.payflow.payflow.exception.ResourceNotFoundException;
import com.payflow.payflow.repository.ContactTypeRepository;
import com.payflow.payflow.repository.UserRepository;

@Repository
public class ContactTypeDao {
	
	@Autowired
	private ContactTypeRepository contactTypeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public ContactType addContactType(ContactType contactType,Long id) {
		userRepository.findById(id)
		.orElseThrow(()-> new ResourceNotFoundException("The user id : "+id+" is not found"));
		contactType.setCreatedBy(id.intValue());
		contactType.setCreatedAt(LocalDateTime.now());
	    return contactTypeRepository.save(contactType);
	}
	
	public ContactType getContactTypeById(Long contactTypeId) {
		return contactTypeRepository.findById(contactTypeId).orElse(null);
	}
	
	public List<ContactType> getAllContactType(){
		return contactTypeRepository.findAll();
	}
	
	public ContactType updateContactType(ContactType contactType,Long id) {
		userRepository.findById(id)
		.orElseThrow(()->new ResourceNotFoundException("The User id : "+id+" is not found"));
		
		ContactType existing =contactTypeRepository.findById(contactType.getContactTypeId())
				.orElseThrow(()-> new ResourceNotFoundException("ContactType not found with id: " + contactType.getContactTypeId()));
		existing.setContactTypeName(contactType.getContactTypeName());
		existing.setContactTypeCode(contactType.getContactTypeCode());
		existing.setContactNature(contactType.getContactNature());
		existing.setUpdatedBy(id.intValue());
		existing.setUpdatedAt(LocalDateTime.now());
		return contactTypeRepository.save(existing);
	}
	
	public ContactType deleteContactType(Long contactTypeId) {
		ContactType contactType = contactTypeRepository.findById(contactTypeId)
				.orElseThrow(()-> new ResourceNotFoundException("ContactType not found with id: " + contactTypeId));
		contactTypeRepository.delete(contactType);
		return contactType;
	}
}

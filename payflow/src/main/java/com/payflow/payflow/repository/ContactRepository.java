package com.payflow.payflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.payflow.payflow.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	@Query("Select c from Contact c where c.contactId = ?1 and c.deletedAt is null")
	Optional<Contact> findByIdAndDeletedAtIsNull(Long contactId);
}
	
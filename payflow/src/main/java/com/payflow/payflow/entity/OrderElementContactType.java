package com.payflow.payflow.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "o_order_element_contact_types")
public class OrderElementContactType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "element_code")
	private String elementCode;
	@Column(name = "contact_type_code")
	private String contactTypeCode;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
}

package com.payflow.payflow.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "o_order_elements")
public class OrderElement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "element_id")
	private Long elementId;
	@Column(name = "element_code")
	private String elementCode;
	@Column(name = "element_name")
	private String elementName;
	@Column(name = "element_local_code")
	private String elementLocalCode;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
	
}

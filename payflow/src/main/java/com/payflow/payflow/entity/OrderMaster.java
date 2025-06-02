package com.payflow.payflow.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "o_order_master")
public class OrderMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "master_id")
	private Long masterId;
	@Column(name = "order_id")
	private Long orderId;
	@Column(name = "account_id")
	private Long accountId;
	@Column(name = "order_element_id")
	private Long orderElementId;
	@Column(name = "order_number")
	private Double orderNumber;
	@Column(name = "order_contact_id")
	private Long orderContactId;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
	
	
}

package com.payflow.payflow.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "o_order_accounts")
public class OrderAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Long accountId;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "account_description")
	private String accountDescription;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name  = "deleted_at")
	private LocalDateTime deletedAt;
	
}

package com.payflow.payflow.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Long paymentId;
	@Column(name = "contact_id")
	private Long contactId;
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	@Column(name = "payment_mode_id")
	private Integer paymentModeId;
	@Column(name = "transaction_amount")
	private Double transactionAmount;
	@Column(name = "transaction_type",columnDefinition = "CHAR(255)")
	private String transactionType;
	@Column(name = "payment_notes")
	private String paymentNotes;
	@Column(name = "created_by")
	private Long createdBy;
	@Column(name = "updated_by")
	private Long updatedBy;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
	
}


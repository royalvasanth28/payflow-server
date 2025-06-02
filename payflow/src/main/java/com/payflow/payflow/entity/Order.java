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
@Table(name = "o_orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	@Column(name = "order_subtotal")
	private Double orderSubtotal;
	@Column(name = "order_discount_amount")
	private Double orderDiscountAmount;
	@Column(name = "order_adjustment_amount")
	private Double orderAdjustmentAmount;
	@Column(name = "order_total")
	private Double orderTotal;
	@Column(name = "order_return")
	private Double orderReturn;
	@Column(name = "order_address_id")
	private Long orderAddressId;
	@Column(name = "order_notes", columnDefinition = "LONGTEXT")
	private String orderNotes;
	@Column(name = "order_conditions", columnDefinition = "LONGTEXT")
	private String orderConditions;
	private Boolean status;
	@Column(name = "created_by")
	private Integer createdBy;
	@Column(name = "updated_by")
	private Integer updatedBy;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
	
	
}

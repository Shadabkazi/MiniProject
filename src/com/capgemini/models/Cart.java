package com.capgemini.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	private String cart_id;
	
	@Column(name="Cart_date")
	private LocalDateTime cart_date;
	
	@Column(name="customer_id")
	private String customer_id;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(String cart_id, LocalDateTime cart_date, String customer_id) {
		super();
		this.cart_id = cart_id;
		this.cart_date = cart_date;
		this.customer_id = customer_id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public LocalDateTime getCart_date() {
		return cart_date;
	}

	public void setCart_date(LocalDateTime cart_date) {
		this.cart_date = cart_date;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cart_date=" + cart_date + ", customer_id=" + customer_id + "]";
	}
	
	

}

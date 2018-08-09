package com.capgemini.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="Item")
public class Item {
	
	@Id
	private int id;
	
	private int quantity;
	private float amount;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	public Item() {
		
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
	
}

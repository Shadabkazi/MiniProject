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
	private String item_id;
	private String prod_id;
	private int quantity;
	private float amount;
	private String cart_id;
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
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
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public Item(String item_id, String prod_id, int quantity, float amount, String cart_id) {
		super();
		this.item_id = item_id;
		this.prod_id = prod_id;
		this.quantity = quantity;
		this.amount = amount;
		this.cart_id = cart_id;
	}
	public Item() {
		
	}
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", prod_id=" + prod_id + ", quantity=" + quantity + ", amount=" + amount
				+ ", cart_id=" + cart_id + "]";
	}
	
	
}

package com.capgemini.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="POrder")
public class POrder {
	
	@Id
	private String order_id;
	private Date order_date;
	private String delivery_address_id;
	private float tax_amount;
	private float discount;
	private float total_amount;
	private String cart_id;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getDelivery_address_id() {
		return delivery_address_id;
	}
	public void setDelivery_address_id(String delivery_address_id) {
		this.delivery_address_id = delivery_address_id;
	}
	public float getTax_amount() {
		return tax_amount;
	}
	public void setTax_amount(float tax_amount) {
		this.tax_amount = tax_amount;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public POrder(String order_id, Date order_date, String delivery_address_id, float tax_amount,
			float discount, float total_amount, String cart_id) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.delivery_address_id = delivery_address_id;
		this.tax_amount = tax_amount;
		this.discount = discount;
		this.total_amount = total_amount;
		this.cart_id = cart_id;
	}
	public POrder() {
		
	}
	@Override
	public String toString() {
		return "POrder [order_id=" + order_id + ", order_date=" + order_date + ", delivery_address_id="
				+ delivery_address_id + ", tax_amount=" + tax_amount + ", discount=" + discount + ", total_amount="
				+ total_amount + ", cart_id=" + cart_id + "]";
	}
	
	
	
	
}

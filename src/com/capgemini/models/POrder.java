package com.capgemini.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="POrder")
public class POrder{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private Date orderDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	private DeliveryAddress address;
	
	private float taxAmount;
	private float discount;
	private float totalAmount;
	
	@OneToOne(cascade=CascadeType.DETACH)
	private Customer customer;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	
	@OneToMany
	private List<Item> items;

	

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}

	public float getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public POrder() {
		// TODO Auto-generated constructor stub
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "POrder [orderId=" + orderId + ", orderDate=" + orderDate + ", address=" + address + ", taxAmount="
				+ taxAmount + ", discount=" + discount + ", totalAmount=" + totalAmount + ", customer=" + customer
				+ ", payment=" + payment + ", items=" + items + "]";
	}

	
	
	
	
	
}

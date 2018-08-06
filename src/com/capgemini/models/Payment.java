package com.capgemini.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Payment")
public class Payment {
	
	@Id
	private String pay_id;
	private String pay_mode;
	private Date pay_date;
	private float tot_amount;
	private String customer_id;
	private String order_id;
	
	public String getPay_id() {
		return pay_id;
	}
	public void setPay_id(String pay_id) {
		this.pay_id = pay_id;
	}
	public String getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public float getTot_amount() {
		return tot_amount;
	}
	public void setTot_amount(float tot_amount) {
		this.tot_amount = tot_amount;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Payment(String pay_id, String pay_mode, Date pay_date, float tot_amount, String customer_id,
			String order_id) {
		super();
		this.pay_id = pay_id;
		this.pay_mode = pay_mode;
		this.pay_date = pay_date;
		this.tot_amount = tot_amount;
		this.customer_id = customer_id;
		this.order_id = order_id;
	}
	
	public Payment() {
	}
	
	@Override
	public String toString() {
		return "Payment [pay_id=" + pay_id + ", pay_mode=" + pay_mode + ", pay_date=" + pay_date + ", tot_amount="
				+ tot_amount + ", customer_id=" + customer_id + ", order_id=" + order_id + "]";
	}
	
	
	
}

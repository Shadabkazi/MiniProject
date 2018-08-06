package com.capgemini.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="delivery_Address")
public class Delivery_Address {
	
	@Id
	private String address_id;
	
	@Column(name="address_line1",length=30)
	private String address_line1;
	
	@Column(name="address_line2",length=30)
	private String address_line2;
	
	@Column(name="address_line3",length=30)
	private String address_line3;
	
	@Column(name="pincode",length=6)
	private int pincode;
	
	@Column(name="mob_no",length=10)
	private int mob_no;
	
	public Delivery_Address() {
		// TODO Auto-generated constructor stub
	}

	public Delivery_Address(String address_id, String address_line1, String address_line2, String address_line3,
			int pincode, int mob_no) {
		super();
		this.address_id = address_id;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.address_line3 = address_line3;
		this.pincode = pincode;
		this.mob_no = mob_no;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getAddress_line3() {
		return address_line3;
	}

	public void setAddress_line3(String address_line3) {
		this.address_line3 = address_line3;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMob_no() {
		return mob_no;
	}

	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}

	@Override
	public String toString() {
		return "Delivery_Address [address_id=" + address_id + ", address_line1=" + address_line1 + ", address_line2="
				+ address_line2 + ", address_line3=" + address_line3 + ", pincode=" + pincode + ", mob_no=" + mob_no
				+ "]";
	}
	

}

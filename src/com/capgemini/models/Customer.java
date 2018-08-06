package com.capgemini.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="CUSTOMER")
public class Customer {
@Id	

private String customer_id;
private String fname;
private String lname;
private int mob_num;
private String email_id;
private String Address_line1;
private String Address_line2;
private String Address_line3;

public String getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(String customer_id) {
	this.customer_id = customer_id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getMob_num() {
	return mob_num;
}
public void setMob_num(int mob_num) {
	this.mob_num = mob_num;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}








public String getAddress_line1() {
	return Address_line1;
}
public void setAddress_line1(String address_line1) {
	Address_line1 = address_line1;
}
public String getAddress_line2() {
	return Address_line2;
}
public void setAddress_line2(String address_line2) {
	Address_line2 = address_line2;
}
public String getAddress_line3() {
	return Address_line3;
}
public void setAddress_line3(String address_line3) {
	Address_line3 = address_line3;
}

@Override
public String toString() {
	return "Customer [customer_id=" + customer_id + ", fname=" + fname + ", lname=" + lname + ", mob_num=" + mob_num
			+ ", email_id=" + email_id + ", Address_line1=" + Address_line1 + ", Address_line2=" + Address_line2
			+ ", Address_line3=" + Address_line3 + "]";
}

public Customer(String customer_id, String fname, String lname, int mob_num, String email_id, String address_line1,
		String address_line2, String address_line3) {
	super();
	this.customer_id = customer_id;
	this.fname = fname;
	this.lname = lname;
	this.mob_num = mob_num;
	this.email_id = email_id;
	Address_line1 = address_line1;
	Address_line2 = address_line2;
	Address_line3 = address_line3;
}
public Customer() {
	// TODO Auto-generated constructor stub
}

}

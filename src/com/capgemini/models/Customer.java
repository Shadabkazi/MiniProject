package com.capgemini.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String fName;
	private String lName;
	private long mobileNumber;
	private String emailId;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return addressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", addressLine3=" + addressLine3 + "]";
	}


	
	

}

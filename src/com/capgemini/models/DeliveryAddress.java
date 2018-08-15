package com.capgemini.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="delivery_Address")
public class DeliveryAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	
	@Column(length=30)
	private String addressLine1;
	
	@Column(length=30)
	private String addressLine2;
	
	@Column(length=30)
	private String addressLine3;
	
	@Column(name="pincode",length=6)
	private int pincode;
	
	@Column(length=10)
	private int mobileNumber;
	
	public DeliveryAddress() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Integer getAddressId() {
		return addressId;
	}



	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", addressLine3=" + addressLine3 + ", pincode=" + pincode + ", mobileNumber="
				+ mobileNumber + "]";
	}

	
	
	

	
	
}

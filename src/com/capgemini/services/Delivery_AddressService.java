package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Delivery_Address;

public interface Delivery_AddressService {

	List<Delivery_Address> findAll();
	Delivery_Address findById(String Delivery_AddressId);
	void add(Delivery_Address Delivery_Address);
	void edit(Delivery_Address Delivery_Address);
	void remove(Delivery_Address Delivery_Address);
	
	List<Delivery_Address> sortById();
	
}

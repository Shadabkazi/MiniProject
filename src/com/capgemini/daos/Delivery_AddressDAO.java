package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Delivery_Address;

public interface Delivery_AddressDAO {

	//Data Access Methods
	public List<Delivery_Address> getAllDelivery_Address();
	
	public Delivery_Address getDelivery_AddressById(String Id);
	
	void insert(Delivery_Address address);
	
	void update(Delivery_Address address);
	
	void delete(Delivery_Address address);
}

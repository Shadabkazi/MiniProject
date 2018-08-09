package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.DeliveryAddress;



public interface DeliveryAddressDAO {

	//Data Access Methods
	public List<DeliveryAddress> getAllDeliveryAddress();
	
	public DeliveryAddress getDeliveryAddressById(int Id);
	
	void insert(DeliveryAddress address);
	
	void update(DeliveryAddress address);
	
	void delete(DeliveryAddress address);
}

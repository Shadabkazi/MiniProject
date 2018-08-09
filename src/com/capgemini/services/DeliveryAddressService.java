package com.capgemini.services;

import java.util.List;

import com.capgemini.models.DeliveryAddress;

public interface DeliveryAddressService {

	List<DeliveryAddress> findAll();
	DeliveryAddress findById(int DeliveryAddressId);
	void add(DeliveryAddress DeliveryAddress);
	void edit(DeliveryAddress DeliveryAddress);
	void remove(DeliveryAddress DeliveryAddress);
	
	List<DeliveryAddress> sortById();
	
}

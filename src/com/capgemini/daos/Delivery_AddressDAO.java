package com.capgemini.daos;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.models.Delivery_Address;

public interface Delivery_AddressDAO {

	//Data Access Methods
	public List<Delivery_Address> getAllDelivery_Address() throws SQLException;
	
	public Delivery_Address getDelivery_AddressById(String Id) throws SQLException;
	
	void insert(Delivery_Address address) throws SQLException;
	
	void update(Delivery_Address address) throws SQLException;
	
	void delete(Delivery_Address address) throws SQLException;
}

package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Customer;

public interface CustomerDao {
   //Data Access methods
	List<Customer> getAllCustomers();
	Customer getCustomerById(int id);
	
	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
}

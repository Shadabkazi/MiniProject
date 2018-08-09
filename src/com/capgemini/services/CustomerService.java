package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Customer;



public interface CustomerService {
	Customer findById(int customerId);
	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	List<Customer> findAll();
	
	List<Customer> sortByIdAsc();
	List<Customer> sortByIdDesc();
	List<Customer> sortByAscName();
	List<Customer> sortByDescName();

}

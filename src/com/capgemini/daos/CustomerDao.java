package com.capgemini.daos;



import java.sql.SQLException;
import java.util.List;

import com.capgemini.models.Customer;

public interface CustomerDao {
   //Data Access methods
	List<Customer> getAllCustomers();
	Customer getCustomerById(String id);
	
	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
}

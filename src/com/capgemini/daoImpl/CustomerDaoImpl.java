package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.CustomerDao;
import com.capgemini.models.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	  @Autowired
		private HibernateTemplate hibernateTemplate;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}

	@Override
	public Customer getCustomerById(String id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, id);
	}

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(customer);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(customer);
	}
	
		
	}



package com.capgemini.servicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.CustomerDao;
import com.capgemini.models.Customer;
import com.capgemini.services.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> sortByIdAsc() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p2.getCustomer_id().compareTo(p1.getCustomer_id()))
				.collect(Collectors.toList());

		// TODO Auto-generated catch block

	}

	@Override
	public List<Customer> sortByIdDesc() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p1.getCustomer_id().compareTo(p2.getCustomer_id()))
				.collect(Collectors.toList());

	}

	@Override
	public List<Customer> sortByAscName() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p2.getFname().compareTo(p1.getFname()))
				.collect(Collectors.toList());

	}

	@Override
	public List<Customer> sortByDescName() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p1.getFname().compareTo(p2.getFname()))
				.collect(Collectors.toList());

	}

	@Override
	public Customer findById(String customer_id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(customer_id);
	}

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.insert(customer);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.delete(customer);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}
}

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

		return findAll().stream().sorted((c1,c2)->c1.getId()>c2.getId()?1:-1)
				.collect(Collectors.toList());

		// TODO Auto-generated catch block

	}

	@Override
	public List<Customer> sortByIdDesc() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((c1,c2)->c2.getId()>c1.getId()?1:-1)
				.collect(Collectors.toList());

	}

	@Override
	public List<Customer> sortByAscName() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p1.getfName().compareTo(p2.getfName()))
				.collect(Collectors.toList());

	}

	@Override
	public List<Customer> sortByDescName() {
		// TODO Auto-generated method stub

		return findAll().stream().sorted((p1, p2) -> p2.getfName().compareTo(p1.getfName()))
				.collect(Collectors.toList());

	}

	@Override
	public Customer findById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(customerId);
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

	@Override
	public Customer findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByEmailId(emailId);
	}
}

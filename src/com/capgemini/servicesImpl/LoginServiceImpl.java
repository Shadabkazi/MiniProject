package com.capgemini.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.models.Customer;
import com.capgemini.services.CustomerService;
import com.capgemini.services.LoginService;

@Service
@Transactional
public class LoginServiceImpl  implements LoginService{

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CustomerService customerService;
	@Override
	public boolean isValidLogin(Customer customer) {
		// TODO Auto-generated method stub
		
		String emailId = customer.getEmailId();
		List<Customer> cus = customerService.findAll();
		
		Customer cust=null;
		
		for (Customer c : cus) {
			if(c.getEmailId().equals(customer.getEmailId())) {
				cust=c;
			}
		}

		if(cust!=null) {
			if(customer.getPassword().equals(cust.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
		/*if (customer.getEmailId().equals("james007@pheonix.com") && customer.getPassword().equals("james007")) {
			return true;
		} else {
			return false;
		}*/

	}

}

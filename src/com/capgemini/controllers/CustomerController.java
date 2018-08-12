package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Customer;
import com.capgemini.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerCustomer(@ModelAttribute Customer customer) {
		// add in jsp file form modelAttribute="Customer"
			customerService.insert(customer);
		
		return "";
	}
	
}

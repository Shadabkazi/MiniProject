package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Customer;
import com.capgemini.services.CustomerService;
import com.capgemini.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/loginCtrl", method=RequestMethod.POST )
	public String validateCustomer(Customer customer, ModelMap map) {
		
		Customer c= customerService.findByEmailId(customer.getEmailId());
		
		if(loginService.isValidLogin(customer)) {
			map.addAttribute("customer",customer);
			map.addAttribute("welcome","Welcome, " + c.getfName());
			System.out.println(c.getfName());
			return "redirect:/";
		}
		else {
			map.addAttribute("error", "Invalid email or password!");
			return "login";
		}
	}
	
	@RequestMapping(value="/login")
	public String loginController() {
		return "login";
	}
	
}

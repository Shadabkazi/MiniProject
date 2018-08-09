package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.models.Cart;
import com.capgemini.services.ProductService;

@Component
public class PaymentController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private Cart cart;
	
	@RequestMapping(value="/payment")
	public String payment(int productId) {
		
		return "payment";
	}
}

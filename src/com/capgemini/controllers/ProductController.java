package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Product;
import com.capgemini.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value="/product/{productId}", method=RequestMethod.GET)
	public String product(@PathVariable("productId")int productId, ModelMap map) {
		Product product=productService.findById(productId);
		
		map.addAttribute("product", product);
		return "product";
	}
}

package com.capgemini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.POrder;
import com.capgemini.services.POrderService;

@Controller
public class POrderController {
	
	@Autowired
	private POrderService pOrderService;
	
	@RequestMapping(value="/order/{orderId}", method=RequestMethod.GET)
	public String OrderDetails(@PathVariable("orderId")int orderId, ModelMap map) {
		POrder order =pOrderService.findOrderById(orderId);
		
		map.addAttribute("order",order);
		
		return "checkout";
	}

}

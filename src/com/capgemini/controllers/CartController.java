package com.capgemini.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.models.Cart;
import com.capgemini.models.Item;
import com.capgemini.models.Product;
import com.capgemini.services.ItemService;
import com.capgemini.services.ProductService;

@Controller
public class CartController {

	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ItemService itemService;
	
	ArrayList<Item> items;
	
	@RequestMapping(value="cart", method=RequestMethod.POST)
	@ResponseBody
	public String addToCart(@RequestParam int productId, @RequestParam("qty") String quantity, HttpSession session,HttpServletRequest request) {
		
		Product p=productService.findById(productId);
		int qty=Integer.parseInt(quantity);
		
		Item i=new Item();
		i.setProduct(p);
		i.setQuantity(qty);
		i.setAmount(p.getPrice()*qty);
		
		itemService.add(i);
		
		Cart c=new Cart();
		if(session.isNew()) {
			items=new ArrayList<>();
			items.add(i);
			session.setAttribute("cartItems", items);
		}else {
			items.add(i);
			session.setAttribute("cartItems", items);
		}
		
		
		return "<script>alert('Product added to Cart'); window.location = \""+request.getContextPath()+"/product/"+productId+"\";</script>";
	}
}

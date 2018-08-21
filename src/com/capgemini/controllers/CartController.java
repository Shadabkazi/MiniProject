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
	
	ArrayList<Item> items=new ArrayList<>();
	
	@RequestMapping(value="cart/add", method=RequestMethod.POST)
	@ResponseBody
	public String addToCart(@RequestParam String productId, @RequestParam("qty") String quantity, HttpSession session,HttpServletRequest request) {
		int id=Integer.parseInt(productId);
		Product p=productService.findById(id);
		int qty=Integer.parseInt(quantity);
		
		Item i=new Item();
		i.setProduct(p);
		i.setQuantity(qty);
		i.setAmount(p.getPrice()*qty);
		// adding item to database
		itemService.add(i);
		
		Cart c=new Cart();
		if(session.isNew()) {
			items.add(i);
			session.setAttribute("cartItems", items);
		}else {
			items.add(i);
			session.setAttribute("cartItems", items);
		}
		
		
		return "<script>alert('Product added to Cart'); window.location = \""+request.getContextPath()+"/product/"+productId+"\";</script>";
	}
	
	@RequestMapping(value="cart", method=RequestMethod.GET)
	public String showCart(HttpSession session, HttpServletRequest request) {
		float totalAmount=0.0f;
		if(session.getAttribute("cartItems")!=null)
		{
			items=(ArrayList<Item>) session.getAttribute("cartItems");
			for (Item item : items) {
				totalAmount+= item.getAmount();
			}
		}
		System.out.println(request.getRealPath("/"));
		session.setAttribute("totalAmount", totalAmount);
		return "cart";
		
	}
	
	@RequestMapping(value="cart/removeAll", method=RequestMethod.GET)
	public String clearCart(HttpSession session) {
		items=(ArrayList<Item>) session.getAttribute("cartItems");
		for (Item item : items) {
			itemService.remove(item);
		}
		items.clear();
		session.removeAttribute("cartItems");
		session.removeAttribute("totalAmount");
		return "cart";
		
	}
	
	
	@RequestMapping(value="cart/update", method=RequestMethod.POST)
	@ResponseBody
	public String updateCart(HttpSession session, @RequestParam("name") String itemName,@RequestParam("quantity") String quantity) {
		items=(ArrayList<Item>) session.getAttribute("cartItems");
		float itemAmount=0;
		for (Item item : items) {
			if(item.getProduct().getName().equals(itemName)) {
				item.setQuantity(Integer.parseInt(quantity));
				item.setAmount(Integer.parseInt(quantity)*item.getProduct().getPrice());
				itemAmount=Integer.parseInt(quantity)*item.getProduct().getPrice();
			}
			
		}
		session.setAttribute("cartItems", items);
		
		return String.valueOf(itemAmount);
		
	}
	
}

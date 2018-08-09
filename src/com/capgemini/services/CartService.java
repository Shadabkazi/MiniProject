package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Cart;

public interface CartService {

	List<Cart> findAll();
	Cart findById(int CartId);
	void add(Cart Cart);
	void edit(Cart Cart);
	void remove(Cart Cart);
	
	
}

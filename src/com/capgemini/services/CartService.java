package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Cart;

public interface CartService {

	List<Cart> findAll();
	Cart findById(String CartId);
	void add(Cart Cart);
	void edit(Cart Cart);
	void remove(Cart Cart);
	
	List<Cart> sortById();
	List<Cart> sortByDate();
	List<Cart> sortByCustomerId();
}

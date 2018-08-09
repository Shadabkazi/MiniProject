package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Cart;

public interface CartDAO {
	
	//Data Access Methods
	public List<Cart> getAllCart();
	
	public Cart getCartById(int Id);
	
	void insert(Cart cart);
	
	void update(Cart cart);
	
	void delete(Cart cart);

}

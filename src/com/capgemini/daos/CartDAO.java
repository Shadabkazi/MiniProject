package com.capgemini.daos;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.models.Cart;

public interface CartDAO {
	
	//Data Access Methods
	public List<Cart> getAllCart() throws SQLException;
	
	public Cart getCartById(String Id) throws SQLException;
	
	void insert(Cart cart) throws SQLException;
	
	void update(Cart cart) throws SQLException;
	
	void delete(Cart cart) throws SQLException;

}

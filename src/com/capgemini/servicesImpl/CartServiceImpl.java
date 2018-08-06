package com.capgemini.servicesImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.CartDAO;
import com.capgemini.models.Cart;
import com.capgemini.services.CartService;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDao;
	
	@Override
	public List<Cart> findAll() {
		ArrayList<Cart> carts;
			carts = (ArrayList<Cart>) cartDao.getAllCart();
			return carts;
		
	}

	@Override
	public Cart findById(String CartId) {
			Cart cart=cartDao.getCartById(CartId);
			return cart;
	}

	@Override
	public void add(Cart Cart) {
			cartDao.insert(Cart);
	}

	@Override
	public void edit(Cart Cart) {
			cartDao.update(Cart);
	}

	@Override
	public void remove(Cart Cart) {
			cartDao.delete(Cart);
		
	}

	@Override
	public List<Cart> sortById() {
		ArrayList<Cart> carts;
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCart_id().compareTo(c2.getCart_id())).collect(Collectors.toList());	
	}

	@Override
	public List<Cart> sortByDate() {
		ArrayList<Cart> carts;
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCart_date().compareTo(c2.getCart_date())).collect(Collectors.toList());	
	}

	@Override
	public List<Cart> sortByCustomerId() {
		ArrayList<Cart> carts;
	
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCustomer_id().compareTo(c2.getCustomer_id())).collect(Collectors.toList());	
	}

	
}

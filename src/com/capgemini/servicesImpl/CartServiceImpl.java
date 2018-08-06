package com.capgemini.servicesImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daos.CartDAO;
import com.capgemini.models.Cart;
import com.capgemini.services.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDao;
	
	@Override
	public List<Cart> findAll() {
		ArrayList<Cart> carts;
		try {
			carts = (ArrayList<Cart>) cartDao.getAllCart();
			return carts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Cart findById(String CartId) {
		try {
			Cart cart=cartDao.getCartById(CartId);
			return cart;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void add(Cart Cart) {
		try {
			cartDao.insert(Cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void edit(Cart Cart) {
		try {
			cartDao.update(Cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Cart Cart) {
		try {
			cartDao.delete(Cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Cart> sortById() {
		ArrayList<Cart> carts;
		try {
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCart_id().compareTo(c2.getCart_id())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Cart> sortByDate() {
		ArrayList<Cart> carts;
		try {
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCart_date().compareTo(c2.getCart_date())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Cart> sortByCustomerId() {
		ArrayList<Cart> carts;
		try {
			carts=(ArrayList<Cart>)cartDao.getAllCart();
			// Return list sorted by ID
			return carts.stream().sorted((c1,c2)->c1.getCustomer_id().compareTo(c2.getCustomer_id())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	
}

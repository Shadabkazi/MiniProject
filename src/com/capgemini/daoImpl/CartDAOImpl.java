package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.CartDAO;
import com.capgemini.models.Cart;

@Repository
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public List<Cart> getAllCart() {
		return	(List<Cart>) hibernateTemplate.find("from Cart");
	}

	@Override
	public Cart getCartById(int Id) {
			return hibernateTemplate.get(Cart.class, Id);
		}

	@Override
	public void insert(Cart cart) {
		hibernateTemplate.save(cart);
	}

	@Override
	public void update(Cart cart) {
		hibernateTemplate.update(cart);
	}

	@Override
	public void delete(Cart cart) {
		hibernateTemplate.delete(cart);
		
	}

}

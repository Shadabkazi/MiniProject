package com.capgemini.daoImpl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	public List<Cart> getAllCart() throws SQLException {
		return	(List<Cart>) hibernateTemplate.find("from cart");
	}

	@Override
	public Cart getCartById(String Id) throws SQLException {
			return hibernateTemplate.get(Cart.class, Id);
		}

	@Override
	public void insert(Cart cart) throws SQLException {
		hibernateTemplate.save(cart);
	}

	@Override
	public void update(Cart cart) throws SQLException {
		hibernateTemplate.update(cart);
	}

	@Override
	public void delete(Cart cart) throws SQLException {
		hibernateTemplate.delete(cart);
		
	}

}

package com.capgemini.daoImpl;


import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.ProductDAO;
import com.capgemini.models.Cart;
import com.capgemini.models.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public List<Product> getAllProducts() throws SQLException {
		return	(List<Product>) hibernateTemplate.find("from Product");
		
}


	@Override
	public Product getProductById(String productId) throws SQLException {
		return hibernateTemplate.get(Product.class, productId);
	}


	@Override
	public void insert(Product product) throws SQLException {
		hibernateTemplate.save(product);
}


	@Override
	public void update(Product product) throws SQLException {
		hibernateTemplate.update(product);
}


	@Override
	public void delete(Product product) throws SQLException {
		hibernateTemplate.delete(product);
}


}

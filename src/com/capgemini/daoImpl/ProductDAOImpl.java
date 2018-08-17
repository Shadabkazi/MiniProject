package com.capgemini.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.ProductDAO;
import com.capgemini.models.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public List<Product> getAllProducts() {
		return	(List<Product>) hibernateTemplate.find("from Product");
		
}


	@Override
	public Product getProductById(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}


	@Override
	public void insert(Product product) {
		hibernateTemplate.save(product);
}


	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
}


	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
}


	@Override
	public List<Product> getProductByCategoryId(int id) {
		
		return (List<Product>) hibernateTemplate.find("from Product p where p.category.id=?", id);
	}

	

}

package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Product;

public interface ProductDAO {
	
	//Data Access Methods
		public List<Product> getAllProducts() ;
		
		public Product getProductById(String productId) ;
		
		void insert(Product product) ;
		
		void update(Product product) ;
		
		void delete(Product product) ;

}

package com.capgemini.daos;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.models.Product;

public interface ProductDAO {
	
	//Data Access Methods
		public List<Product> getAllProducts() throws SQLException;
		
		public Product getProductById(String productId) throws SQLException;
		
		void insert(Product product) throws SQLException;
		
		void update(Product product) throws SQLException;
		
		void delete(Product product) throws SQLException;

}

package com.capgemini.services;

import java.util.List;


import com.capgemini.models.Product;


public interface ProductService {

	List<Product> findAll();
	Product findById(String productId);
	void add(Product product);
	void edit(Product product);
	void remove(Product product);
	
	List<Product> sortById();
	List<Product> sortByNameAscending();
	List<Product> sortByNameDescending();
	List<Product> sortByBrandAsc();
	List<Product> sortByBrandDesc();
	List<Product> sortAscByPrice();
	List<Product> sortDescByPrice();
}

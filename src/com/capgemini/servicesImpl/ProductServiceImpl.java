package com.capgemini.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.ProductDAO;
import com.capgemini.models.Product;
import com.capgemini.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;
	
	
	@Override
	public ArrayList<Product> findAll() {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			return products;
		
	}

	@Override
	public Product findById(int productId) {
			Product product=productDao.getProductById(productId);
			return product;
	}

	@Override
	public void add(Product product) {
			productDao.insert(product);
	}

	@Override
	public void edit(Product product) {
			productDao.update(product);
		
	}

	@Override
	public void remove(Product product)   {
			productDao.delete(product);
		
	}

	@Override
	public List<Product> sortById()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			return products.stream().sorted((p1,p2)->p1.getId()>p2.getId()?1:-1).collect(Collectors.toList());		// return ID sorted list
	}

	@Override
	public List<Product> sortByNameAscending()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Name Ascending
			return products.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());		
	}

	@Override
	public List<Product> sortByNameDescending()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Name Descending
			return products.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).collect(Collectors.toList());		
	}

	@Override
	public List<Product> sortByBrandAsc()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Brand Ascending
			return products.stream().sorted((p1,p2)->p1.getBrand().compareTo(p2.getBrand())).collect(Collectors.toList());		
	}

	@Override
	public List<Product> sortByBrandDesc()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Brand Descending
			return products.stream().sorted((p1,p2)->p2.getBrand().compareTo(p1.getBrand())).collect(Collectors.toList());		
	}

	@Override
	public List<Product> sortAscByPrice()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Price Ascending
			return products.stream().sorted((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).collect(Collectors.toList());			
		}

	@Override
	public List<Product> sortDescByPrice()   {
		ArrayList<Product> products;
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Price Descending
			return products.stream().sorted((p1,p2)->p2.getPrice()>p1.getPrice()?1:-1).collect(Collectors.toList());		
	}

	@Override
	public List<Product> findByCategoryId(int id) {
		
		return productDao.getProductByCategoryId(id);
	}

	
}

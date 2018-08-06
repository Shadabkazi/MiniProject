package com.capgemini.servicesImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daoImpl.ProductDAOImpl;
import com.capgemini.daos.ProductDAO;
import com.capgemini.models.Product;
import com.capgemini.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;
	
	
	@Override
	public ArrayList<Product> findAll() {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			return products;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public Product findById(String productId) {
		
		try {
			Product product=productDao.getProductById(productId);
			return product;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void add(Product product) {
		try {
			productDao.insert(product);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void edit(Product product) {
		try {
			productDao.update(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove(Product product)   {
		try {
			productDao.delete(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> sortById()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			return products.stream().sorted().collect(Collectors.toList());		// return ID sorted list
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Product> sortByNameAscending()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Name Ascending
			return products.stream().sorted((p1,p2)->p1.getProd_name().compareTo(p2.getProd_name())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> sortByNameDescending()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Name Descending
			return products.stream().sorted((p1,p2)->p2.getProd_name().compareTo(p1.getProd_name())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> sortByBrandAsc()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Brand Ascending
			return products.stream().sorted((p1,p2)->p1.getProd_brand().compareTo(p2.getProd_brand())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> sortByBrandDesc()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Brand Descending
			return products.stream().sorted((p1,p2)->p2.getProd_brand().compareTo(p1.getProd_brand())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> sortAscByPrice()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Price Ascending
			return products.stream().sorted((p1,p2)->p1.getProd_price()>p2.getProd_price()?1:-1).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
		}

	@Override
	public List<Product> sortDescByPrice()   {
		ArrayList<Product> products;
		try {
			products=(ArrayList<Product>)productDao.getAllProducts();
			// Return list sorted by Price Descending
			return products.stream().sorted((p1,p2)->p2.getProd_price()>p1.getProd_price()?1:-1).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}

	
}

package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.CategoryDAO;
import com.capgemini.models.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		
		return (List<Category>) hibernateTemplate.find("from category");
	}

	@Override
	public Category getCategoryById(int category_id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Category.class, category_id);
	
	}

	@Override
	public void insert(Category category) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(category);
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(category);
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(category);
		
	}
				
	}

	



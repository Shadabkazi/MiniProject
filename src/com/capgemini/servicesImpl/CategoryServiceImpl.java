package com.capgemini.servicesImpl;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daos.CategoryDAO;
import com.capgemini.models.Category;
import com.capgemini.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAO categoryDao;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}

	@Override
	public Category findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(categoryId);
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		categoryDao.insert(category);
	}

	@Override
	public void edit(Category category) {
		// TODO Auto-generated method stub
		categoryDao.update(category);
	}

	@Override
	public void remove(Category category) {
		// TODO Auto-generated method stub
		categoryDao.delete(category);
	}


	}

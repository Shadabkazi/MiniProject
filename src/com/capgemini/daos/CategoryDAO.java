package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Category;

public interface CategoryDAO {

	public List<Category> getAllCategories();
	public Category getCategoryById(int category_id);
	public void insert(Category category);
	public void update(Category category);
	public void delete(Category category);
}

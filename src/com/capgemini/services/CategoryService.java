package com.capgemini.services;

import java.util.List;


import com.capgemini.models.Category;
import com.capgemini.models.Image;

public interface CategoryService {
	

List<Category> findAll();
	
Category findCategoryById(int categoryId);
	
	void add(Category category);
	void edit(Category category);
	void remove(Category category);

}

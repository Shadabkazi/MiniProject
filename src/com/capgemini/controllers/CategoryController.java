package com.capgemini.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Category;
import com.capgemini.services.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/categories/{categoryId}", method=RequestMethod.GET)
	public String getAllCategories(ModelMap map, @PathVariable("categoryId")int categoryId) {
		
		Category category=categoryService.findCategoryById(categoryId);
		map.addAttribute("category",category);
		
		List<Category> categories=categoryService.findAll();
		map.addAttribute("categories",categories);
		
		
		return "categories";
	}
}

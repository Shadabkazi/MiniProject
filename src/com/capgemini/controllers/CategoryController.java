package com.capgemini.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Category;
import com.capgemini.models.Product;
import com.capgemini.services.CategoryService;
import com.capgemini.services.ProductService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/categories/{categoryId}", method=RequestMethod.GET)
	public String getAllCategories(ModelMap map, @PathVariable("categoryId")int categoryId) {
		
		Category category=categoryService.findCategoryById(categoryId);
		map.addAttribute("category",category);
		System.out.println(category);
		// For Category name in menu
		List<Category> categories=categoryService.findAll();
		map.addAttribute("categories",categories);
		
		
		// Category image start
		try {
			File file = new File("\\uploaded\\"+category.getImage().getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.lastModified());
			FileInputStream fis=new FileInputStream(file);
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			int b;
			byte[] buffer = new byte[1024];
			while((b=fis.read(buffer))!=-1){
			   bos.write(buffer,0,b);
			}
			byte[] fileBytes=bos.toByteArray();
			fis.close();
			bos.close();
			
         
			byte[] encoded2=Base64.encodeBase64(fileBytes);
			String encoded = new String(encoded2,"UTF-8");
			//System.out.println(encoded);
			
			map.addAttribute("cimage",encoded);
			//map.addAttribute("imagePath",file.getAbsolutePath());
			
			// Category image end
			
			
			// Get all Products for current category
			List<Product> products=productService.findByCategoryId(categoryId);
			System.out.println(products);
			map.addAttribute("products",products);
			
			
			// Product image encoding start
			
			ArrayList<String> images=new ArrayList<>();
			
	            for (Product product : products) {
	            	System.out.println(product.getImage().getName());
	            	
	            	
	            	File productFile = new File("\\uploaded\\"+product.getImage().getName());
	            	System.out.println(productFile.getAbsolutePath());
	            	fis=new FileInputStream(productFile);
	            	bos=new ByteArrayOutputStream();
	     
	            	while((b=fis.read(buffer))!=-1){
	            	   bos.write(buffer,0,b);
	            	}
	            	fileBytes=bos.toByteArray();
	            	fis.close();
	            	bos.close();


	            	byte[] productEncoded=Base64.encodeBase64(fileBytes);
	            	String encodedString = new String(productEncoded);
	            	
	            	images.add(encodedString);
	            	
	            }	
			
			map.addAttribute("productImages", images);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	// product image end
		
		return "categories";
	}
}

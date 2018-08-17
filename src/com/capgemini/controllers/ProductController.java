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
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/product/{productId}", method=RequestMethod.GET)
	public String product(@PathVariable("productId")int productId, ModelMap map) {
		Product product=productService.findById(productId);
		map.addAttribute("product", product);
		
		
		// For Category name in menu
		List<Category> categories=categoryService.findAll();
		map.addAttribute("categories",categories);
			
		// for product image
		System.out.println(product.getImage().getName());
    	
    	
    	try {
			File productFile = new File("\\uploaded\\"+product.getImage().getName());
			System.out.println(productFile.getAbsolutePath());
			FileInputStream fis=new FileInputStream(productFile);
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			int b;
			byte[] buffer=new byte[1024];
			while((b=fis.read(buffer))!=-1){
			   bos.write(buffer,0,b);
			}
			byte[] fileBytes=bos.toByteArray();
			fis.close();
			bos.close();


			byte[] productEncoded=Base64.encodeBase64(fileBytes);
			String encodedString = new String(productEncoded);
			map.addAttribute("productImage",encodedString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	// end of one product image
    	
    	// Get all Products for current category
    				List<Product> products=productService.findByCategoryId(product.getCategory().getId());
    				System.out.println(products);
    				map.addAttribute("products",products);
    				
    				
    				// Product image encoding start
    				
    				ArrayList<String> images=new ArrayList<>();
    				
    		            try {
							for (Product p: products) {
								System.out.println(p.getImage().getName());
								
								
								File productFile = new File("\\uploaded\\"+p.getImage().getName());
								System.out.println(productFile.getAbsolutePath());
								FileInputStream fis=new FileInputStream(productFile);
								ByteArrayOutputStream bos=new ByteArrayOutputStream();
								int b;
								byte[] buffer=new byte[1024];
								while((b=fis.read(buffer))!=-1){
								   bos.write(buffer,0,b);
								}
								byte[] fileBytes=bos.toByteArray();
								fis.close();
								bos.close();


								byte[] productEncoded=Base64.encodeBase64(fileBytes);
								String encodedString = new String(productEncoded);
								
								images.add(encodedString);
								
							}
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
    				
    				map.addAttribute("pimages", images);
		
		return "product";
	}
	
}

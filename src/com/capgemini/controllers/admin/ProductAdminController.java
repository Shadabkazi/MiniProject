package com.capgemini.controllers.admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.capgemini.models.Category;
import com.capgemini.models.Image;
import com.capgemini.models.Product;
import com.capgemini.services.CategoryService;
import com.capgemini.services.ProductService;

@Controller

public class ProductAdminController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;
	
	// Viewing all Products

	@RequestMapping(value = "admin/products", method = RequestMethod.GET)
	public String viewProducts(ModelMap map) {
		List<Product> products = productService.findAll();
		map.addAttribute("products", products);
		return "admin/ProductsView";
	}

	// show ProductAddForm page
	@GetMapping("admin/product/add")
	public String showAdminPage(ModelMap map) {
		List<Category> categories=categoryService.findAll();
		/*Map<String,String> category=new LinkedHashMap<>();
		for (Category cat : categories) {
			category.put(String.valueOf(cat.getId()), cat.getcName());
		}
		for (Map.Entry<String,String> entry : category.entrySet()) 
			System.out.println("Key = " + entry.getKey() +
			                 ", Value = " + entry.getValue());
		*/
		map.addAttribute("Product",new Product());
		map.addAttribute("category",categories);
		
		return "admin/ProductAddForm";
	}
	
	// adding product
	@PostMapping(value="admin/product/add", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public String addProduct(@RequestParam("name")String name, @RequestParam("brand")String brand, @RequestParam("price")float price, @RequestParam("description")String description, @RequestParam("category") String category,  @RequestParam("image") MultipartFile file) {
		 if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();
					
		                BufferedOutputStream buffStream = 
		                        new BufferedOutputStream(new FileOutputStream(new File("\\uploaded\\"+ file.getOriginalFilename())));
		                buffStream.write(bytes);
		                buffStream.flush();
		                buffStream.close();
					// Create the file on server
					
					FileInputStream finImg2=new FileInputStream("\\uploaded\\"+ file.getOriginalFilename());
					Blob productImg=BlobProxy.generateProxy(bytes);
					
					Image img=new Image();
					img.setName(file.getOriginalFilename());
					img.setImage(productImg);
					
					/*ArrayList<Image> images=new ArrayList<>();
					images.add(img);*/
					
					System.out.println(name);
					System.out.println(brand);
					System.out.println(price);
					System.out.println(description);
					System.out.println(category);
					
					Product product=new Product();
					product.setName(name);
					product.setBrand(brand);
					product.setDescription(description);
					product.setPrice(price);
					product.setImage(img);
					Category c=categoryService.findCategoryById(Integer.parseInt(category));
					System.out.println(c);
					product.setCategory(c);
					
					productService.add(product);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
		 }
	    

		return "redirect:/admin/products";
	}

	// editing products
	@PostMapping("/admin/product/edit")
	public String editProduct(@ModelAttribute Product product) {
		System.out.println(product);
		productService.edit(product);
		return "redirect:/admin/products";
	}

	// show Product Edit page
	@RequestMapping(value = "/admin/product/{productId}/edit", method = RequestMethod.GET)
	public String showEditProductPage(ModelMap map, @PathVariable("productId") int productId) {
		Product p = productService.findById(productId);
		map.addAttribute("product", p);
		
		return "admin/ProductEditForm";
	}

	// deleting Products
	@GetMapping("/admin/product/{productId}/remove")
	public String removeProduct(@PathVariable("productId") int productId) {
		Product p = productService.findById(productId);
		productService.remove(p);
		return "redirect:/admin/products";
	}

}

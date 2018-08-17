package com.capgemini.controllers.admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.sql.Blob;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

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
import com.capgemini.services.CategoryService;

@Controller
public class CategoryAdminController {

	@Autowired
	private CategoryService categoryService;

	//Viewing categories
	 @GetMapping("admin/category")
	    public String viewCategory(ModelMap map)
	    {
	    	List<Category> categories= categoryService.findAll();
	    	map.addAttribute("categories", categories);
	    	return "admin/CategoriesView";
	    }
	 
	 @GetMapping("admin/category/add")
	 public String addCategory() {
		 
		 return "admin/CategoryAddForm";
	 }
	 
	 
	 
	 @RequestMapping(value="admin/category/addData",method=RequestMethod.POST ,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	    public String addCategoryData(@RequestParam("image") MultipartFile file,@RequestParam("cName")String name,@RequestParam("cDescription")String description)
	    {
		 if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();
					
		                BufferedOutputStream buffStream = 
		                        new BufferedOutputStream(new FileOutputStream(new File("\\uploaded\\"+ file.getOriginalFilename())));
		                buffStream.write(bytes);
		                
					// Create the file on server
					
					FileInputStream finImg=new FileInputStream("\\uploaded\\"+ file.getOriginalFilename());
					Blob categoryImg=BlobProxy.generateProxy(finImg, finImg.available());
					//System.out.println(context.getRealPath("")+"/resources/uploaded/"+ file.getOriginalFilename());
					Image img=new Image();
					img.setName(file.getOriginalFilename());
					img.setImage(categoryImg);
					
					Category c=new Category();
					c.setcName(name);
					c.setcDescription(description);
					c.setImage(img);
					
					categoryService.add(c);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
		 }
	    
	    	return "redirect:/admin/category";
	    }
	 
	 //editing categories
	 @PostMapping("/admin/category/edit")
	    public String editCategory(@ModelAttribute Category category)
	    {
	    	categoryService.edit(category);
	    	return "redirect:/admin/category";
	    }
	 
	 
	 @GetMapping("/admin/category/{categoryId}/edit")
	    public String showEditCategoryPage(ModelMap map,@PathVariable("categoryId")int categoryId)
	    {
		 Category c=categoryService.findCategoryById(categoryId);
		 	map.addAttribute("Category",c);
	    	return "admin/CategoryEditForm";
	    }
	 
	 //deleting categories
	 @GetMapping("/admin/category/{categoryId}/remove")
	    public String removeCategory(@PathVariable("categoryId")int categoryId)
	    {
		 	Category c=categoryService.findCategoryById(categoryId);
	    	categoryService.remove(c);
	    	return "redirect:/admin/category";
	    }
}

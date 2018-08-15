package com.capgemini.controllers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Category;
import com.capgemini.services.CategoryService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexPage(ModelMap map) {
		List<Category> categories=categoryService.findAll();
		map.addAttribute("categories",categories);
		
		try{
            for (Category category : categories) {
            	System.out.println(category.getImage().getName());
            	File f=new File("downloaded/"+category.getImage().getName());
            	System.out.println(f.getAbsolutePath());
            	 FileOutputStream fos = new FileOutputStream(f);
            	 
            	// get blob from db
            	 Blob imageBlob=category.getImage().getImage();
            	 /*// read blob data
            	 int blobLength = (int) imageBlob.length();  
            	 byte[] blobAsBytes = imageBlob.getBytes(1, blobLength);*/
            	 
                 fos.write(imageBlob.getBytes(1l, (int) imageBlob.length()));
                 fos.close();
                 System.out.println("File saved");
            	
			}
           
		}catch (SQLException ex) {
            ex.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
		
		return "index";
	}
	
	
	
}

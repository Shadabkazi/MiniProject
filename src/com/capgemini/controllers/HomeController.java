package com.capgemini.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.codec.binary.Base64;
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
	public String indexPage(ModelMap map, HttpSession session) {
		String isLogin="False";
		if(session.getAttribute("isLogin")!=null){
			isLogin= (String) session.getAttribute("isLogin");
		}
		
		List<Category> categories=categoryService.findAll();
		map.addAttribute("categories",categories);
		ArrayList<String> images=new ArrayList<>();
		
		try{
            for (Category category : categories) {
            	System.out.println(category.getImage().getName());
            	
            	
            	File file = new File("\\uploaded\\"+category.getImage().getName());
            	System.out.println(file.getAbsolutePath());
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


            	byte[] encoded=Base64.encodeBase64(fileBytes);
            	String encodedString = new String(encoded);
            	
            	
            	images.add(encodedString);
            	
            	
            	
            	
            	 /*FileOutputStream fos = new FileOutputStream("\\downloaded\\"+category.getImage().getName());
            	 String imgPath = "\\downloaded\\"+category.getImage().getName();
            	 map.addAttribute("imgPath", imgPath);
            	 
            	 
            	 // get blob from db
            	 Blob imageBlob=category.getImage().getImage();
            	 // read blob data
            	 int blobLength = (int) imageBlob.length();  
            	 byte[] blobAsBytes = imageBlob.getBytes(1, blobLength);
            	 
                 fos.write(blobAsBytes);
                 fos.close();
                 System.out.println("File saved");*/
            	
			}
            
            map.addAttribute("images", images);
           
		}
         catch(Exception e){
            e.printStackTrace();
        }
		
		return "index";
	}

}

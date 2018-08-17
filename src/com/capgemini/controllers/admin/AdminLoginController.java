package com.capgemini.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.models.Admin;
import com.capgemini.services.AdminService;

@Controller
public class AdminLoginController{

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/adminLogin", method=RequestMethod.POST)
	public String AdminController(Admin admin,ModelMap map) {
		
		if(adminService.isValid(admin)) {
			map.addAttribute("admin", admin);
			map.addAttribute("welcome", "Welcome, " + admin.getUsername());
			return "admin/CategoriesView";
		}
		else {
			map.addAttribute("loginError", "Invalid username or password!");
			return "redirect:/admin";
		}
		
	}

	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String showAdminLogin() {
		return "admin/adminLogin";
	}
	
}

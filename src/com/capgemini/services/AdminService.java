package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Admin;



public interface AdminService {
	Admin findById(int AdminId);
	void insert(Admin admin);
	void update(Admin admin);
	void delete(Admin admin);
	List<Admin> findAll();
	 List<Admin> sortByIdAsc();
	 List<Admin> sortByIdDesc();
	 List<Admin> sortByNameAsc();
	 List<Admin> sortByNameDesc();
	 
	 boolean isValid(Admin admin);
}

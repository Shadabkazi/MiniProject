package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Admin;
public interface AdminDao {
	
	   //Data Access methods
		List<Admin> getAllAdmins();
		Admin getAdminById(int id);
		
		void insert(Admin admin);
		void update(Admin admin);
		void delete(Admin admin);
	}


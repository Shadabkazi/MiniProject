package com.capgemini.daos;
import java.sql.SQLException;
import java.util.List;

import com.capgemini.models.Admin;
public interface AdminDao {
	



	
	   //Data Access methods
		List<Admin> getAllAdmins();
		Admin getAdminById(String id);
		
		void insert(Admin admin);
		void update(Admin admin);
		void delete(Admin admin);
	}


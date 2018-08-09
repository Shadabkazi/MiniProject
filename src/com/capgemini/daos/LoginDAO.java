package com.capgemini.daos;


import java.util.List;

import com.capgemini.models.Login;

public interface LoginDAO {

List<Login> getAllProducts();
	
	Login getLoginById(int loginId);
	
	void insert(Login login);
	void update(Login login);
	void delete(Login login);
	
	
	
}

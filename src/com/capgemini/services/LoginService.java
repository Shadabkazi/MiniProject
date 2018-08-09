package com.capgemini.services;

import java.util.List;


import com.capgemini.models.Login;

public interface LoginService {

List<Login> findAll();
	
	Login findLoginById(int loginId);
	void add(Login login);
	void edit(Login login);
	void remove(Login login);
	
}

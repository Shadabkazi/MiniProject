package com.capgemini.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daos.LoginDAO;
import com.capgemini.models.Login;
import com.capgemini.services.LoginService;

@Service
@Transactional
public class LoginServiceImpl  implements LoginService{

	@Autowired
	private LoginDAO loginDAO;

	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return loginDAO.getAllProducts();
	}

	@Override
	public Login findLoginById(int loginId) {
		// TODO Auto-generated method stub
		return loginDAO.getLoginById(loginId);
	}

	@Override
	public void add(Login login) {
		// TODO Auto-generated method stub
		loginDAO.insert(login);
	}

	@Override
	public void edit(Login login) {
		// TODO Auto-generated method stub
		loginDAO.update(login);
	}

	@Override
	public void remove(Login login) {
		// TODO Auto-generated method stub
		loginDAO.delete(login);
	}
	
	}

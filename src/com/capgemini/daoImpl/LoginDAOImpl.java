package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.LoginDAO;
import com.capgemini.models.Login;

@Repository
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Login> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Login>) hibernateTemplate.find("from Login");
	}

	@Override
	public Login getLoginById(int loginId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Login.class, loginId);
	}

	@Override
	public void insert(Login login)  {
		// TODO Auto-generated method stub
		hibernateTemplate.save(login);
	}

	@Override
	public void update(Login login){
		// TODO Auto-generated method stub
		hibernateTemplate.update(login);
	}

	@Override
	public void delete(Login login) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(login);
	}
		
		

}
	

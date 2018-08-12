package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.AdminDao;
import com.capgemini.models.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return (List<Admin>) hibernateTemplate.find("from Admin");
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Admin.class, id);
	}

	@Override
	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(admin);
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(admin);
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(admin);
	}

}

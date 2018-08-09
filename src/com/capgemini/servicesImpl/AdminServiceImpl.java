package com.capgemini.servicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.AdminDao;
import com.capgemini.models.Admin;
import com.capgemini.services.AdminService;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	 @Autowired
	private AdminDao adminDao;
	 
	@Override
	public Admin findById(int AdminId) {
		return adminDao.getAdminById(AdminId);
	}

	@Override
	public void insert(Admin admin) {
		adminDao.insert(admin);
	}

	@Override
	public void update(Admin admin) {
		adminDao.update(admin);
	}

	@Override
	public void delete(Admin admin) {
		adminDao.delete(admin);
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.getAllAdmins();
	}

	@Override
	public List<Admin> sortByIdAsc() {
		return findAll().stream().sorted((a1,a2)->a1.getId()>a2.getId()?1:-1).collect(Collectors.toList());
	}

	@Override
	public List<Admin> sortByIdDesc() {
		return findAll().stream().sorted((a1,a2)->a2.getId()>a1.getId()?1:-1).collect(Collectors.toList());
	}

	@Override
	public List<Admin> sortByNameAsc() {
		return findAll().stream().sorted((p1,p2)->p1.getUsername().compareTo(p2.getUsername())).collect(Collectors.toList());
	}

	@Override
	public List<Admin> sortByNameDesc() {
		return findAll().stream().sorted((p1,p2)->p2.getUsername().compareTo(p1.getUsername())).collect(Collectors.toList());
	}
	
}
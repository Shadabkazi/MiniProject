package com.capgemini.daoImpl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.ItemDAO;
import com.capgemini.models.Admin;
import com.capgemini.models.Item;

@Repository
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return (List<Item>) hibernateTemplate.find("from item");
		
	}

	@Override
	public Item getItemById(String item_id) {
		// TODO Auto-generated method stub
		
		return hibernateTemplate.get(Item.class, item_id);
	}

	@Override
	public void insert(Item item){
		hibernateTemplate.save(item);
	}

	@Override
	public void update(Item item){
		hibernateTemplate.update(item);
	}

	@Override
	public void delete(Item item){
		hibernateTemplate.delete(item);
	}
	
	

	
	}




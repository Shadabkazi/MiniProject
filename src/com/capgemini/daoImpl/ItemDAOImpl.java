package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.ItemDAO;
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
	public Item getItemById(int itemId) {
		// TODO Auto-generated method stub
		
		return hibernateTemplate.get(Item.class, itemId);
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




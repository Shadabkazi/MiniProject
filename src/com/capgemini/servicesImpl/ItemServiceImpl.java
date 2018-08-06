package com.capgemini.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.ItemDAO;
import com.capgemini.models.Item;
import com.capgemini.services.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDAO itemDao;

	public ItemDAO getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDAO itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public List<Item> findAllItems() {
		// TODO Auto-generated method stub
		 
			return itemDao.getAllItems();
	}

	@Override
	public Item findItemById(String item_id) {
		return itemDao.getItemById(item_id);
			
	}

	@Override
	public void add(Item Item) {
			itemDao.insert(Item);
	}

	@Override
	public void edit(Item Item) {
			itemDao.update(Item);
	}

	@Override
	public void remove(Item Item) {
			itemDao.delete(Item);
		
	}

}

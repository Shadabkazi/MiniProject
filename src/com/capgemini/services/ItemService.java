package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Item;

public interface ItemService {

	List<Item> findAllItems();

	Item findItemById(int itemId);

	void add(Item Item);

	void edit(Item Item);

	void remove(Item Item);

	
}

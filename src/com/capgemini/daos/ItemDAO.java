package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Item;

public interface ItemDAO {

	// data access methods
			List<Item> getAllItems();

			Item getItemById(int itemId);

			void insert(Item item);

			void update(Item item);

			void delete(Item item);
		
}

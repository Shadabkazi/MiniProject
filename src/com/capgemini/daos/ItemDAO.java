package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Item;

public interface ItemDAO {

	// data access methods
			List<Item> getAllItems();

			Item getItemById(String item_id);

			void insert(Item item);

			void update(Item item);

			void delete(Item item);
		
}

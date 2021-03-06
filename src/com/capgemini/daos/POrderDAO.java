package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.POrder;

public interface POrderDAO {
	

	// data access methods
	List<POrder> getAllOrders();

	POrder getOrderById(int orderId);

	void insert(POrder order);

	void update(POrder order);

	void delete(POrder order);
	
}

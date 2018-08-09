package com.capgemini.services;

import java.util.List;

import com.capgemini.models.POrder;

public interface POrderService {

	List<POrder> findAllOrders() ;

	POrder findOrderById(int orderId);

	void add(POrder order) ;

	void edit(POrder order) ;

	void remove(POrder order) ;

	
}

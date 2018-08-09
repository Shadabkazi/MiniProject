package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.POrderDAO;
import com.capgemini.models.POrder;

@Repository
public class POrderDAOImpl implements POrderDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<POrder> getAllOrders() {
		return (List<POrder>) hibernateTemplate.find("from POrder");
		
	}

	@Override
	public POrder getOrderById(int orderId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(POrder.class, orderId);
	}

	@Override
	public void insert(POrder order) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(order);
	}

	@Override
	public void update(POrder order)  {
		hibernateTemplate.update(order);
		
	}

	@Override
	public void delete(POrder order) {
		hibernateTemplate.delete(order);
	}

		
	
	
}

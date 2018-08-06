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

import com.capgemini.daos.POrderDAO;
import com.capgemini.models.Admin;
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
	public POrder getOrderById(String order_id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(POrder.class, order_id);
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

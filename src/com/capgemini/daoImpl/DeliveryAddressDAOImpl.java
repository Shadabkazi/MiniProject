package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.DeliveryAddressDAO;
import com.capgemini.models.DeliveryAddress;

@Repository
public class DeliveryAddressDAOImpl implements DeliveryAddressDAO {	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<DeliveryAddress> getAllDeliveryAddress(){
		return (List<DeliveryAddress>)hibernateTemplate.find("from DeliveryAddress");
	}

	@Override
	public DeliveryAddress getDeliveryAddressById(int Id) {
		return hibernateTemplate.get(DeliveryAddress.class, Id);
	}

	@Override
	public void insert(DeliveryAddress address) {
		hibernateTemplate.save(address);
	}

	@Override
	public void update(DeliveryAddress address) {
		hibernateTemplate.update(address);
	}

	@Override
	public void delete(DeliveryAddress address) {
		hibernateTemplate.delete(address);		
		
	}
	
	
		
}

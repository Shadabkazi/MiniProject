package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.Delivery_AddressDAO;
import com.capgemini.models.Delivery_Address;

@Repository
public class Delivery_AddressDAOImpl implements Delivery_AddressDAO {	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Delivery_Address> getAllDelivery_Address(){
		return (List<Delivery_Address>) hibernateTemplate.find("from Delivery_address");
	}

	@Override
	public Delivery_Address getDelivery_AddressById(String Id) {
		return hibernateTemplate.get(Delivery_Address.class, Id);
	}

	@Override
	public void insert(Delivery_Address address) {
		hibernateTemplate.save(address);
	}

	@Override
	public void update(Delivery_Address address) {
		hibernateTemplate.update(address);
	}

	@Override
	public void delete(Delivery_Address address) {
		hibernateTemplate.delete(address);		
		
	}
	
	
		
}

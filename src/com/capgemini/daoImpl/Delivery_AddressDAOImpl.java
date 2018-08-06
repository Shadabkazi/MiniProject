package com.capgemini.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.Delivery_AddressDAO;
import com.capgemini.models.Cart;
import com.capgemini.models.Delivery_Address;

@Repository
public class Delivery_AddressDAOImpl implements Delivery_AddressDAO {	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Delivery_Address> getAllDelivery_Address() throws SQLException {
		return	(List<Delivery_Address>) hibernateTemplate.find("from Delivery_address");
	}

	@Override
	public Delivery_Address getDelivery_AddressById(String Id) throws SQLException {
		return hibernateTemplate.get(Delivery_Address.class, Id);
	}

	@Override
	public void insert(Delivery_Address address) throws SQLException {
		hibernateTemplate.save(address);
	}

	@Override
	public void update(Delivery_Address address) throws SQLException {
		hibernateTemplate.update(address);
	}

	@Override
	public void delete(Delivery_Address address) throws SQLException {
		hibernateTemplate.delete(address);		
		
	}
	
	
		
}

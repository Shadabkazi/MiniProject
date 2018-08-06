package com.capgemini.servicesImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daoImpl.Delivery_AddressDAOImpl;
import com.capgemini.daos.Delivery_AddressDAO;
import com.capgemini.models.Delivery_Address;
import com.capgemini.services.Delivery_AddressService;

@Service
public class Delivery_AddressServiceImpl implements Delivery_AddressService{

	@Autowired
	private Delivery_AddressDAO dAddress_dao;
	
	@Override
	public List<Delivery_Address> findAll() {
		ArrayList<Delivery_Address> addresses;
		try {
			addresses=(ArrayList<Delivery_Address>) dAddress_dao.getAllDelivery_Address();
			return addresses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Delivery_Address findById(String Delivery_AddressId) {
		try {
			Delivery_Address dAddress=dAddress_dao.getDelivery_AddressById(Delivery_AddressId);
			return dAddress;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void add(Delivery_Address Delivery_Address) {
		try {
			dAddress_dao.insert(Delivery_Address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void edit(Delivery_Address Delivery_Address) {
		try {
			dAddress_dao.update(Delivery_Address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove(Delivery_Address Delivery_Address) {
		try {
			dAddress_dao.delete(Delivery_Address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Delivery_Address> sortById() {
		ArrayList<Delivery_Address> addresses;
		try {
			addresses=(ArrayList<Delivery_Address>)dAddress_dao.getAllDelivery_Address();
			// Return list sorted by ID
			return addresses.stream().sorted((p1,p2)->p1.getAddress_id().compareTo(p2.getAddress_id())).collect(Collectors.toList());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	
}

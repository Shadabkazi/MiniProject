package com.capgemini.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.DeliveryAddressDAO;
import com.capgemini.models.DeliveryAddress;
import com.capgemini.services.DeliveryAddressService;

@Service
@Transactional
public class DeliveryAddressServiceImpl implements DeliveryAddressService{

	@Autowired
	private DeliveryAddressDAO dAddress_dao;
	
	@Override
	public List<DeliveryAddress> findAll() {
		return (ArrayList<DeliveryAddress>) dAddress_dao.getAllDeliveryAddress();
	}

	@Override
	public DeliveryAddress findById(int DeliveryAddressId) {
		return dAddress_dao.getDeliveryAddressById(DeliveryAddressId);
		
	}

	@Override
	public void add(DeliveryAddress DeliveryAddress) {
			dAddress_dao.insert(DeliveryAddress);
		
	}

	@Override
	public void edit(DeliveryAddress DeliveryAddress) {
			dAddress_dao.update(DeliveryAddress);
		
	}

	@Override
	public void remove(DeliveryAddress DeliveryAddress) {
			dAddress_dao.delete(DeliveryAddress);
		
	}

	@Override
	public List<DeliveryAddress> sortById() {
		ArrayList<DeliveryAddress> addresses;
			addresses=(ArrayList<DeliveryAddress>)dAddress_dao.getAllDeliveryAddress();
			// Return list sorted by ID
			return addresses.stream().sorted((p1,p2)->(p1.getAddressId()>p2.getAddressId())?1:-1).collect(Collectors.toList());		
		
	}

	
}

package com.capgemini.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.POrderDAO;
import com.capgemini.models.POrder;
import com.capgemini.services.POrderService;

@Service
@Transactional
public class POrderServiceImpl implements POrderService {
	
	@Autowired
	private POrderDAO podao;
	

	@Override
	public List<POrder> findAllOrders() {
			List<POrder> porders = podao.getAllOrders();
			return porders;
	}

	@Override
	public POrder findOrderById(String order_id) {
			POrder o = podao.getOrderById(order_id);
			return o;
	}

	@Override
	public void add(POrder order) {
			podao.insert(order);
	}

	@Override
	public void edit(POrder order) {
			podao.update(order);
		
	}

	@Override
	public void remove(POrder order) {
			podao.delete(order);
	}

}

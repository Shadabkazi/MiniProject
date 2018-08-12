package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.PaymentDAO;
import com.capgemini.models.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Payment> getAllPayments() {
		return (List<Payment>)hibernateTemplate.find("from Payment");
		
	}

	@Override
	public Payment getPaymentById(int payId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Payment.class, payId);
	}

	@Override
	public void insert(Payment payment){
		hibernateTemplate.save(payment);	
	}

	@Override
	public void update(Payment payment) {
		hibernateTemplate.update(payment);
	}

	@Override
	public void delete(Payment payment) {
		hibernateTemplate.delete(payment);
		
	}

	
	
}

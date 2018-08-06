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

import com.capgemini.daos.PaymentDAO;
import com.capgemini.models.Admin;
import com.capgemini.models.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Payment> getAllPayments() {
		return (List<Payment>) hibernateTemplate.find("from payment");
		
	}

	@Override
	public Payment getPaymentById(String pay_id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Payment.class, pay_id);
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

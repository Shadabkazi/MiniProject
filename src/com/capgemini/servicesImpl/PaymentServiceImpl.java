package com.capgemini.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.daos.PaymentDAO;
import com.capgemini.models.Payment;
import com.capgemini.services.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO pdao;


	@Override
	public List<Payment> findAllPayment(){
			List<Payment> payments = pdao.getAllPayments();
			return payments;
	}

	@Override
	public Payment findPaymentById(int pay_id){
			Payment p = pdao.getPaymentById(pay_id);
			return p;
		
	}

	@Override
	public void add(Payment payment){
			pdao.insert(payment);
		
	}

	@Override
	public void edit(Payment payment){
			pdao.update(payment);
		
	}

	@Override
	public void remove(Payment payment){
			pdao.delete(payment);
	}

}

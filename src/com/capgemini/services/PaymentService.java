package com.capgemini.services;

import java.util.List;


import com.capgemini.models.Payment;

public interface PaymentService {

	List<Payment> findAllPayment();

	Payment findPaymentById(String pay_id);

	void add(Payment payment);

	void edit(Payment payment);

	void remove(Payment payment);
	
}

package com.capgemini.daos;


import java.util.List;

import com.capgemini.models.Payment;

public interface PaymentDAO {
	
	// data access methods
		List<Payment> getAllPayments();

		Payment getPaymentById(int payId);

		void insert(Payment payment);

		void update(Payment payment);

		void delete(Payment payment);

	
}

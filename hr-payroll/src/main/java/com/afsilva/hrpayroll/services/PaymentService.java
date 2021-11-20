package com.afsilva.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.afsilva.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 300.0, days);
		
	}
}

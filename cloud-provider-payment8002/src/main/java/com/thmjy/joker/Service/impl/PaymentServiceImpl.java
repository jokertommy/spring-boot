package com.thmjy.joker.Service.impl;

import com.thmjy.joker.Service.PaymentService;
import com.thmjy.joker.dao.PaymentDao;
import com.thmjy.joker.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

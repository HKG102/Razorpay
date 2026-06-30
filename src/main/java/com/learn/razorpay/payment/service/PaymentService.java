package com.learn.razorpay.payment.service;

import com.learn.razorpay.payment.dto.request.PaymentInitRequest;
import com.learn.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentInitRequest request);
}

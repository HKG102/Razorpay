package com.learn.razorpay.payment.gateway;

import com.learn.razorpay.payment.gateway.dto.PaymentRequest;
import com.learn.razorpay.payment.gateway.dto.PaymentResult;

public interface PaymentAdapter {
    PaymentResult initiate(PaymentRequest request);
}

package com.learn.razorpay.payment.gateway.adapter;

import com.learn.razorpay.payment.gateway.PaymentAdapter;
import com.learn.razorpay.payment.gateway.dto.PaymentRequest;
import com.learn.razorpay.payment.gateway.dto.PaymentResult;

import java.util.UUID;

public class CardPaymentAdapter implements PaymentAdapter {
    @Override
    public PaymentResult initiate(PaymentRequest request) {
        return null;
    }

    @Override
    public PaymentResult capture(UUID paymentId) {
        return null;
    }
}

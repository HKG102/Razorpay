package com.learn.razorpay.payment.gateway.adapter;

import com.learn.razorpay.payment.gateway.PaymentAdapter;
import com.learn.razorpay.payment.gateway.dto.PaymentRequest;
import com.learn.razorpay.payment.gateway.dto.PaymentResult;

public class NetBankingAdapter implements PaymentAdapter {
    @Override
    public PaymentResult initiate(PaymentRequest request) {
        return null;
    }
}

package com.learn.razorpay.payment.processor.strategy;

import com.learn.razorpay.payment.processor.PaymentProcessor;
import com.learn.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.learn.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}

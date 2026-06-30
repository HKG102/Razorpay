package com.learn.razorpay.payment.processor;

import com.learn.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.learn.razorpay.payment.processor.dto.PaymentProcessorResponse;

public interface PaymentProcessor {
    PaymentProcessorResponse charge(PaymentProcessorRequest request);
}

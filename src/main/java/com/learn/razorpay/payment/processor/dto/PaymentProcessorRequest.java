package com.learn.razorpay.payment.processor.dto;

import com.learn.razorpay.common.entity.Money;
import com.learn.razorpay.common.enums.PaymentMethod;

import java.util.Map;

public record PaymentProcessorRequest(
        PaymentMethod method,
        Money amount,
        Map<String, Object> methodDetails
) {
}
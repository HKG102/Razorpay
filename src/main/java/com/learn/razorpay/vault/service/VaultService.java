package com.learn.razorpay.vault.service;


import com.learn.razorpay.common.entity.Money;
import com.learn.razorpay.payment.processor.dto.PaymentProcessorResponse;
import com.learn.razorpay.vault.dto.request.TokenizeRequest;
import com.learn.razorpay.vault.dto.response.TokenizeResponse;

import java.util.Map;
import java.util.UUID;

public interface VaultService {
    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}

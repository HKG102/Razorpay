package com.learn.razorpay.merchant.service;

import com.learn.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.learn.razorpay.merchant.dto.response.ApiKeyCreateResponse;

import java.util.UUID;

public interface ApiKeyService {
    ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);
}

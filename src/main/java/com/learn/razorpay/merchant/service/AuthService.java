package com.learn.razorpay.merchant.service;

import com.learn.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.learn.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}

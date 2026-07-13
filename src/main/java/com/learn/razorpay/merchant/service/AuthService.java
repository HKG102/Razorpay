package com.learn.razorpay.merchant.service;

import com.learn.razorpay.merchant.dto.request.LoginRequest;
import com.learn.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.learn.razorpay.merchant.dto.response.LoginResponse;
import com.learn.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);

    LoginResponse login(LoginRequest request);
}

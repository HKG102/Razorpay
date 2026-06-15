package com.learn.razorpay.payment.service;

import com.learn.razorpay.payment.dto.request.CreateOrderRequest;
import com.learn.razorpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);
}

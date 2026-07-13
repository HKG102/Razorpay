package com.learn.razorpay.payment.controller;

import com.learn.razorpay.payment.dto.request.CreateOrderRequest;
import com.learn.razorpay.payment.dto.response.OrderResponse;
import com.learn.razorpay.payment.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    UUID merchantId = UUID.fromString("ce4938c6-c0ec-4282-9c02-91d81cf35c77"); //TODO: replace it with MerchantContext

    @PostMapping
    public ResponseEntity<OrderResponse> create(@RequestBody @Valid CreateOrderRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderService.create(merchantId, request));
    }
}

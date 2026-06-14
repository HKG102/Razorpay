package com.learn.razorpay.merchant.dto.request;

import com.learn.razorpay.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) { }

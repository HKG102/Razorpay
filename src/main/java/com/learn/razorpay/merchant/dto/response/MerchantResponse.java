package com.learn.razorpay.merchant.dto.response;

import com.learn.razorpay.common.enums.BusinessType;
import com.learn.razorpay.common.enums.MerchantStatus;

import java.util.UUID;

public record MerchantResponse(
        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {
}

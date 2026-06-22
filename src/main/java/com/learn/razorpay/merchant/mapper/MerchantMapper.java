package com.learn.razorpay.merchant.mapper;


import com.learn.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.learn.razorpay.merchant.dto.response.MerchantResponse;
import com.learn.razorpay.merchant.entity.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MerchantMapper {

    Merchant toEntityFromSignUpRequest(MerchantSignupRequest request);

    MerchantResponse toResponse(Merchant merchant);
}

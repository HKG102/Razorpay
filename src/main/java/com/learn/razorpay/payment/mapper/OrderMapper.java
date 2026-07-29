package com.learn.razorpay.payment.mapper;

import com.learn.razorpay.payment.dto.response.OrderResponse;
import com.learn.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    @Mapping(target = "status", source = "orderRecord.orderStatus")
    OrderResponse toResponse(OrderRecord orderRecord);
}

package com.learn.razorpay.payment.repository;

import com.learn.razorpay.payment.entity.OrderRecord;
import com.learn.razorpay.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    List<Payment> findByOrder_Id(OrderRecord orderId);

    Optional<Payment> findByIdAndMerchantId(UUID paymentId, UUID merchantId);
}

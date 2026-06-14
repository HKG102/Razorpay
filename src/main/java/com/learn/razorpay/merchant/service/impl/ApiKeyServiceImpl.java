package com.learn.razorpay.merchant.service.impl;

import com.learn.razorpay.common.exception.ResourceNotFoundException;
import com.learn.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.learn.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.learn.razorpay.merchant.entity.ApiKey;
import com.learn.razorpay.merchant.entity.Merchant;
import com.learn.razorpay.merchant.repository.ApiKeyRepository;
import com.learn.razorpay.merchant.repository.MerchantRepository;
import com.learn.razorpay.merchant.service.ApiKeyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepository;
    private final MerchantRepository merchantRepository;

    @Override
    public ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request) {

        Merchant merchant = merchantRepository.findById(merchantId)
                .orElseThrow(() -> new ResourceNotFoundException("merchant", merchantId));

        String keyId = "rzp_"+request.environment().name().toUpperCase()+"big_random_string";
        String rawSecret = "big_random_secret"; // TODO: replace with cryptography random hex
        // a-z, A-Z, 0-9,-,_

        ApiKey apiKey = ApiKey.builder()
                .merchant(merchant)
                .keyId(keyId)
                .keySecretHash(rawSecret) // TODO: encode with BcryptPasswordEncoder
                .environment(request.environment())
                .build();

        apiKey = apiKeyRepository.save(apiKey);

        return new ApiKeyCreateResponse(apiKey.getId(), keyId, rawSecret, request.environment());
    }
}

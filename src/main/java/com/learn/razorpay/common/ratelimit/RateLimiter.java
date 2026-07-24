package com.learn.razorpay.common.ratelimit;

public interface RateLimiter {

    RateLimitResult check(String key, int maxRequestAllowed, long windowSeconds);

}

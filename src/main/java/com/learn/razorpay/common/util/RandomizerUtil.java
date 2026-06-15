package com.learn.razorpay.common.util;

import java.security.SecureRandom;
import java.util.Base64;

public class RandomizerUtil {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static String randomBase64(int length) {

        byte[] buf = new byte[length]; // {-128, 127} Base64 converts every 3 bytes into 4 characters (~4/3 size increase)
        // if length is 4 -> [0,0,0,0]
        SECURE_RANDOM.nextBytes(buf);
        // [9, -120, 89, 46]

        return Base64.getUrlEncoder()
                .withoutPadding() // without padding remove == at the end
                .encodeToString(buf);
    }
}

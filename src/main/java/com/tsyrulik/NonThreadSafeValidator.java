package com.tsyrulik;

import java.util.concurrent.atomic.AtomicInteger;

public class NonThreadSafeValidator {
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public NonThreadSafeValidator() {
        System.out.println("NonThreadSafeValidator created");
    }

    public boolean isValid(Order order) {
        int i = atomicInteger.incrementAndGet();

        if(i == 2) {
            throw new IllegalStateException("nonThreadSafeValidator is called twice");
        }

        return true;
    }
}

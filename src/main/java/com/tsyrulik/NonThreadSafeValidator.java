package com.tsyrulik;

import java.util.UUID;

public class NonThreadSafeValidator {
    private UUID uuid;

    public NonThreadSafeValidator() {
        uuid = UUID.randomUUID();
    }

    public boolean isValid(Order order) {
        System.out.println(uuid + ": isValid called");
        return true;
    }

}

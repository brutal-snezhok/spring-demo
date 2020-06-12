package com.tsyrulik;

import org.springframework.stereotype.Component;

@Component
public class OrderValidatorExtended implements OrderValidator {
    @Override
    public boolean isValid(Order order) {
        return true;
    }
}

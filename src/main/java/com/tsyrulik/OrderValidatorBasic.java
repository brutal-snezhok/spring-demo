package com.tsyrulik;

import javax.inject.Provider;

public class OrderValidatorBasic implements OrderValidator {
    private int minOrderNumber = 1;

    private final Provider<NonThreadSafeValidator> nonThreadSafeValidator;

    public OrderValidatorBasic(Provider<NonThreadSafeValidator> nonThreadSafeValidator) {
        this.nonThreadSafeValidator = nonThreadSafeValidator;
    }

    @Override
    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return true;
        }
        nonThreadSafeValidator.get().isValid(order);

        return false;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }
}

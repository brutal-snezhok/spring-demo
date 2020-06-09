package com.tsyrulik;

import org.springframework.beans.factory.ObjectFactory;

public class OrderValidator {
    private int minOrderNumber = 1;

    private final ObjectFactory<NonThreadSafeValidator> nonThreadSafeValidator;

    public OrderValidator(ObjectFactory<NonThreadSafeValidator> nonThreadSafeValidator) {
        this.nonThreadSafeValidator = nonThreadSafeValidator;
    }

    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return true;
        }
        nonThreadSafeValidator.getObject().isValid(order);

        return false;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }
}

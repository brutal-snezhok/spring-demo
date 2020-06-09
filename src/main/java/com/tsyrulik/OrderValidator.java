package com.tsyrulik;

public class OrderValidator {
    private int minOrderNumber = 1;

    private final NonThreadSafeValidator nonThreadSafeValidator;

    public OrderValidator(NonThreadSafeValidator nonThreadSafeValidator) {
        this.nonThreadSafeValidator = nonThreadSafeValidator;
    }

    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return true;
        }
        nonThreadSafeValidator.isValid(order);

        return false;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }
}

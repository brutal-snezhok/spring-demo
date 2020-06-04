package com.tsyrulik;

public class OrderValidator {
    private int minOrderNumber = 1;

    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return true;
        }

        return false;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }
}

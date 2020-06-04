package com.tsyrulik;

public class Order {
    private final Integer orderNumber;

    public Order(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                '}';
    }
}

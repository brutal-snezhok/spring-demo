package com.tsyrulik;

public class OrderService {
    private final OrderValidator orderValidator;

    public OrderService(OrderValidator orderValidator) {
        this.orderValidator = orderValidator;
    }

    public void createOrder(Order order) {

        if(orderValidator.isValid(order)) {
            System.out.println("Order" + order + " is created");
        } else {
            System.out.println("Order" + order + " is not valid");
        }

    }
}

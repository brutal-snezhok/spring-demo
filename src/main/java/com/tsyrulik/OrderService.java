package com.tsyrulik;

public class OrderService {
    private OrderValidator orderValidator;

    public void createOrder(Order order) {

        if(orderValidator.isValid(order)) {
            System.out.println("Order" + order + " is created");
        } else {
            System.out.println("Order" + order + " is not valid");
        }

    }

    public void setOrderValidator(OrderValidator orderValidator) {
        this.orderValidator = orderValidator;
    }
}

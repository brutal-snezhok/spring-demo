package com.tsyrulik;

public class OrderService {
    private final OrderValidator orderValidator;

    public void init() {
        System.out.println("OrderService.init");
    }

    public void destroy() {
        System.out.println("OrderService.destroy");
    }

    public OrderService(OrderValidator orderValidator) {
        this.orderValidator = orderValidator;
        System.out.println("orderService created");
    }

    public void createOrder(Order order) {

        if(orderValidator.isValid(order)) {
            System.out.println("Order" + order + " is created");
        } else {
            System.out.println("Order" + order + " is not valid");
        }
    }
}

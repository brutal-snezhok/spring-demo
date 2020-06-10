package com.tsyrulik;

import java.util.List;

public class OrderService {
    private final List<OrderValidator> orderValidators;

    public void init() {
        System.out.println("OrderService.init");
    }

    public void destroy() {
        System.out.println("OrderService.destroy");
    }

    public OrderService(List<OrderValidator> orderValidators) {
        this.orderValidators = orderValidators;
        System.out.println("orderService created");
    }

    public void createOrder(Order order) {

        if(orderValidators.stream().allMatch(ov -> ov.isValid(order))) {
            System.out.println("Order" + order + " is created");
        } else {
            System.out.println("Order" + order + " is not valid");
        }
    }
}

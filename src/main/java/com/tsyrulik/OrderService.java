package com.tsyrulik;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OrderService {
    private final OrderValidator orderValidator;

    private String prop;

    @PostConstruct
    public void init() {
        System.out.println("OrderService.init " + prop);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("OrderService.destroy");
    }

    public OrderService(@Qualifier("main") OrderValidator orderValidator) {
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

    public void setProp(String prop) {
        this.prop = prop;
    }
}

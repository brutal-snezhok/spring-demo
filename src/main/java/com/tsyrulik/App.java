package com.tsyrulik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.tsyrulik");
        applicationContext.refresh();

        applicationContext.getBean(OrderService.class);
        applicationContext.getBean(OrderService.class);
        applicationContext.getBean(OrderService.class);
//        orderService.createOrder(new Order(456));
//        orderService.createOrder(new Order(457));
//
//        applicationContext.close();
    }
}

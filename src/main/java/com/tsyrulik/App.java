package com.tsyrulik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        OrderValidator validator = new OrderValidator();
//        validator.setMinOrderNumber(122);
//        OrderService service = new OrderService(validator);
//
//        service.createOrder(new Order(123));


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.createOrder(new Order(123));
    }
}

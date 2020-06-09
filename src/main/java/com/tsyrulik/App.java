package com.tsyrulik;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class App {
    public static void main(String[] args) {
//        OrderValidator validator = new OrderValidator();
//        validator.setMinOrderNumber(122);
//        OrderService service = new OrderService(validator);
//
//        service.createOrder(new Order(123));


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        applicationContext.getBeanFactory().registerScope("thread", new SimpleThreadScope());

        OrderService orderService1 = applicationContext.getBean(OrderService.class);
//        OrderService orderService2 = applicationContext.getBean(OrderService.class);

       // orderService.createOrder(new Order(123));
    }
}

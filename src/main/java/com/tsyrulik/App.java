package com.tsyrulik;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.tsyrulik");
        new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("app.xml");
        applicationContext.getBeanFactory().registerScope("thread", new SimpleThreadScope());
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

package com.tsyrulik;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class App {
    public static void main(String[] args) {
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("app.xml");
        applicationContext.getBeanFactory().registerScope("thread", new SimpleThreadScope());
        applicationContext.refresh();

        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.createOrder(new Order(456));
    }
}

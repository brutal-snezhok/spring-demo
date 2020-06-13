package com.tsyrulik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().addActiveProfile("test");
        applicationContext.scan("com.tsyrulik");

        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        applicationContext.getBean(OrderService.class);

    }
}

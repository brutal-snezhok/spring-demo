package com.tsyrulik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tsyrulik")
public class AppConfig {

    @Bean
    public OrderValidator validator1() {
        System.out.println("Validator1 is called");
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(10);
        return orderValidatorBasic;
    }
}

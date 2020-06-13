package com.tsyrulik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService() {
        return new OrderService(validator1());
    }

    @Bean
    @Primary
    public OrderValidator validator1() {
        System.out.println("Validator1 is called");
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(10);
        return orderValidatorBasic;
    }

    @Bean
    public OrderValidator validator2() {
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(20);
        return orderValidatorBasic;
    }
}

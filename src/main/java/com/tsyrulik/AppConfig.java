package com.tsyrulik;

import org.springframework.context.annotation.*;

@Configuration
@Profile("!test")
public class AppConfig {

    @Bean
    @Primary
    public OrderValidator validator1() {
        System.out.println("Validator1 is called");
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(10);
        return orderValidatorBasic;
    }
}

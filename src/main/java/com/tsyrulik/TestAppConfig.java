package com.tsyrulik;

import org.springframework.context.annotation.*;

@Configuration
@Profile("test")
public class TestAppConfig {

    @Bean
    @Primary
    public OrderValidator validator1() {
        System.out.println("testValidator is called");
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(10);
        return orderValidatorBasic;
    }

}

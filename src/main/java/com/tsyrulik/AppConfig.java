package com.tsyrulik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public OrderValidatorBasic validator1() {
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(10);
        return orderValidatorBasic;
    }

    @Bean
    public OrderValidatorBasic validator2() {
        OrderValidatorBasic orderValidatorBasic = new OrderValidatorBasic();
        orderValidatorBasic.setMinOrderNumber(20);
        return orderValidatorBasic;
    }
}

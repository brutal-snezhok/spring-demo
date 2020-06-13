package com.tsyrulik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public OrderService orderService(OrderValidator orderValidator) {
        return new OrderService(orderValidator);
    }
}

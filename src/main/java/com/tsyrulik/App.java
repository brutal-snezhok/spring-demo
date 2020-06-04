package com.tsyrulik;

public class App {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        OrderValidator validator = new OrderValidator();

        service.setOrderValidator(validator);
        service.createOrder(new Order(123));
    }
}

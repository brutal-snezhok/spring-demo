package com.tsyrulik;

public class App {
    public static void main(String[] args) {
        OrderValidator validator = new OrderValidator();
        validator.setMinOrderNumber(122);
        OrderService service = new OrderService(validator);

        service.createOrder(new Order(123));
    }
}

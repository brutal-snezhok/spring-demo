package com.tsyrulik;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderValidatorTest {
    NonThreadSafeValidator nonThreadSafeValidator = new NonThreadSafeValidator();
    OrderValidator orderValidator = new OrderValidator(() -> nonThreadSafeValidator);

    @Test
    public void isValid() {
        orderValidator.isValid(new Order(123));
    }
}

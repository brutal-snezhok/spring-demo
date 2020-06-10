package com.tsyrulik;

import org.junit.Test;

public class OrderValidatorTest {
    NonThreadSafeValidator nonThreadSafeValidator = new NonThreadSafeValidator();
    OrderValidatorBasic orderValidator = new OrderValidatorBasic(() -> nonThreadSafeValidator);

    @Test
    public void isValid() {
        orderValidator.isValid(new Order(123));
    }
}

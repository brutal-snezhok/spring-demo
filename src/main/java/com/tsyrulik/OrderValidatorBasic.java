package com.tsyrulik;

@Trace
public class OrderValidatorBasic implements OrderValidator {
    private int minOrderNumber = 1;

    //private final Provider<NonThreadSafeValidator> nonThreadSafeValidator;

    public OrderValidatorBasic() {
    }

    @Override
    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return false;
        }

        return true;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }
}

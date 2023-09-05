package com.company;

public class Cancelled implements OrderState{


    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled can't be cancelled");
    }
}

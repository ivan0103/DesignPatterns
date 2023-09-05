package com.company;

public class New implements OrderState{


    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No charges");
        return 0;
    }
}

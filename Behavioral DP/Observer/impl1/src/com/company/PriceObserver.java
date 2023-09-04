package com.company;

//Concrete observer
public class PriceObserver implements OrderObserver{

    @Override
    public void updated(Order order) {
        double count = order.getItemCost();
        if (count >= 500){
            order.setDiscount(20);
        }
        else if(count >= 200) {
            order.setDiscount(10);
        }
    }
}

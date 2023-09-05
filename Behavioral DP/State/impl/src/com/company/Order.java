package com.company;

//Context class
public class Order {

	private OrderState currentState;

	public Order() {
		this.currentState = new New();
	}

	public double cancel() {
		double res = currentState.handleCancellation();
		currentState = new Cancelled();
		return res;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}

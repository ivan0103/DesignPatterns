package com.company;

import com.company.email.*;
import com.company.email.Template.TemplateType;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade emailFacade = new EmailFacade();
		boolean result = emailFacade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}
}

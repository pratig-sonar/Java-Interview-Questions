package com.pratig.patterns.structural.facade;

public class ClientFacade {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OrderFacade facade = new OrderFacade();
		facade.processOrder("macbook", 10);
	}

}

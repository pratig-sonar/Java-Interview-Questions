package com.pratig.patterns.structural.facade;

public class OrderFacade {
	
	public void processOrder(String name, int quant) throws InterruptedException {
		OrderProcessor orderProcessor = new OrderProcessor();
		if(orderProcessor.checkStock(name)) {
			Thread.sleep(2000);
			String orderId = orderProcessor.placeOrder(name, quant);
			Thread.sleep(2000);
			orderProcessor.shipOrder(orderId);
		}
			
	}
	
	

}

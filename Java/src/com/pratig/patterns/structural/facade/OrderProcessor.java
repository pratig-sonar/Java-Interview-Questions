package com.pratig.patterns.structural.facade;

public class OrderProcessor {
	public boolean checkStock(String name) {
		System.out.println("Checking stock...");
		return true;
	}
	public String placeOrder(String name, int quant) {
		System.out.println("Placing order...");
		return "abc123";
	}
	public void shipOrder(String orderId) {
		System.out.println("Order " + orderId + " shipped. Thank you!!!");
	}
}

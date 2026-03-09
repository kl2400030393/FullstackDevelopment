package com.klu.model;


import org.springframework.beans.factory.annotation.Autowired;

@Component
public class order {
	private int orderId;
	private String customerName;
	private int quantity;
	private Product product;
	
	@Autowired
	public order() {
		this.orderId=2988;
		this.customerName="Raj";
		this.quantity=4;
	}
	
	public void display() {
		System.out.println("")
		System.out.println("")
		System.out.println("")
		System.out.println("")
		System.out.println("")
		System.out.println("")
		System.out.println("")
		System.out.println("")


	}

}

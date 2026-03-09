package com.klu.model;

@Component
public class product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public product() {
		this.productId=181;
		this.productName="Laptop";
		this.price=60000.00;
		this.category="Electronics";
	}
	
	public int getproductId() {
		return productId;
	}
	public String getproductName() {
		return productName;
	}
	public double getprice() {
		return price;
	}
	public String getcategory() {
		return category;
	}

}

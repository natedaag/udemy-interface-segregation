package com.udemy.intfc.segregation;

public class Product {
	
	private int privateId;
	private String productName;

	public int getPrivateId() {
		return privateId;
	}
	public void setPrivateId(int privateId) {
		this.privateId = privateId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	
}
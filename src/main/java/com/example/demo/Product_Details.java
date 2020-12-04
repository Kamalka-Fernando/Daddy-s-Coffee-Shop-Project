package com.example.demo;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

public class Product_Details {
	private int id;
	private String product_name;
	private String product_price;
	private String description;
	protected Product_Details(int id, String product_name, String product_price, String description) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.description = description;
	}
	@Id
	@lombok.Generated
	public int getId() {
		return id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

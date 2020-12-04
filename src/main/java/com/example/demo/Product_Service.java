package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Product_Service {

	@Autowired
	private Product_Interface repo;
	
	public List<Product_Details> listAll(){
		return repo.findAll();
	}
	
	public void save(Product_Details product) {
		repo.save(product);
	}
	
	public Product_Details get(int id) {
		return (Product_Details) repo.findById(id);
	}
	
	
	
}

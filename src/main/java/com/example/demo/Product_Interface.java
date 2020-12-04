package com.example.demo;

import java.util.List;

public interface Product_Interface {

	List<Product_Details> findAll();

	void save(Product_Details product);

	Object findById(int id);

}

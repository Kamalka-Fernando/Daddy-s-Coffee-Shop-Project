package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class ProductController {
	
	@Autowired
	private Product_Service service;

	public String viewHomePage(Model model) {
		List<Product_Details> listProducts = service.listAll();
		model.addAttribute("List of Coffee Drinks Available");
		
		return "index";
	}
}

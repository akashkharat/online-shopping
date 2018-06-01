package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.entity.Product;
import com.shoppingbackend.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService; 
	
	
	@GetMapping(value="/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping(value="/products/{categoryId}")
	public List<Product> getProductsByCategory(@PathVariable Integer categoryId){
		
		
		return null;
	}

}

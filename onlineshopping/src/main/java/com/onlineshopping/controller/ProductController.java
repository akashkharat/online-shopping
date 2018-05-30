package com.onlineshopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.entity.Product;

@RestController
public class ProductController {
	
	@GetMapping(value="/products")
	public List<Product> getAllProducts(){
		
		return new ArrayList<>();
	}

}

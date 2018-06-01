package com.shoppingbackend.service;

import java.util.List;

import com.shoppingbackend.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public List<Product> getProductsByCategory(Integer id);
}

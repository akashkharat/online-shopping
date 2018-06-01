package com.shoppingbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingbackend.entity.Product;
import com.shoppingbackend.repositories.ProductRepository;
import com.shoppingbackend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRespository;
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> allproducts=productRespository.findAll();
		return allproducts;
	}

	@Override
	public List<Product> getProductsByCategory(Integer categoryId) {
		
		return productRespository.findByCategory(categoryId);
	}

}

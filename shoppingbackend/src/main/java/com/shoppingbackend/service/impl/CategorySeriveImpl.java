package com.shoppingbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingbackend.entity.Category;
import com.shoppingbackend.repositories.CategoryRepository;
import com.shoppingbackend.service.CategoryService;

@Service
public class CategorySeriveImpl implements CategoryService {

	@Autowired
	 private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategories() {
		
		return categoryRepository.findAll();
	}

	@Override
	public Category saveCategory(Category category) {
		
		return categoryRepository.save(category);
	}


}

package com.shoppingbackend.service;

import java.util.List;

import com.shoppingbackend.entity.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category saveCategory(Category category);

}

package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.entity.Category;
import com.shoppingbackend.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService; 
	
	@GetMapping(value="/categories")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping(value="/category")
	public Category addNewCategory(@RequestBody Category category){
		
		return categoryService.saveCategory(category);
	}
}
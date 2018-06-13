package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.entity.User;
import com.shoppingbackend.repositories.UserRepository;
import com.shoppingbackend.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value="/signup")
	public User signup(@RequestBody User user) {
		User existingUser=userService.findbyEmail(user.getEmail());
		
		if(existingUser==null)
		userService.saveUser(user);
		return user;
		
	}
	
	@GetMapping(value="/allUsers")
	public List<User> getAllUsers(){
		 
		return userRepository.findAll();
	}

}

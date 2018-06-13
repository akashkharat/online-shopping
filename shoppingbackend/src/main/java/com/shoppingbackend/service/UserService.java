package com.shoppingbackend.service;

import com.shoppingbackend.entity.User;

public interface UserService {
	
	public User findbyEmail(String email);
	
	public User saveUser(User user);

}

package com.shoppingbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingbackend.entity.User;
import com.shoppingbackend.repositories.UserRepository;
import com.shoppingbackend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User findbyEmail(String email) {
		// TODO Auto-generated method stub
		 return userRepository.findByEmail(email);
	}
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setRole("CUSTOMER");
		return userRepository.save(user);
	}

}

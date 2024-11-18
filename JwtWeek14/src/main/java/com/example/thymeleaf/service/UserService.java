package com.example.thymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import com.example.thymeleaf.entity.User;
import com.example.thymeleaf.repository.UserRepository;

public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> allUser() {
		List<User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}
	
	public void save(User user) {
        userRepository.save(user);
    }
}

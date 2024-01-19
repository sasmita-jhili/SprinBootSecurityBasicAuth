package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String createUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		return "user added in db";
	}

}

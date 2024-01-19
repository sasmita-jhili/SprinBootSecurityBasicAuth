package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.repo.UserRepository;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/create")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		service.createUser(user);
		String msg = "User created....";
		return ResponseEntity.ok(msg);
	}
}

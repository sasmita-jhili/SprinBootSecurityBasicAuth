package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.app.entity.User;
import com.app.repo.UserRepository;

@Component
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     Optional<User> userInfo=repo.findByName(username);
     return userInfo.map(CustomUserDetail::new)
     .orElseThrow(()->new UsernameNotFoundException("User not found : "+username));
		 
	}

}

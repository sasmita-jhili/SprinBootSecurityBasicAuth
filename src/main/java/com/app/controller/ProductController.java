package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("This Welcome Page...");
		
	}
//	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/product/all")
	public ResponseEntity<String> allProduct(){
		return ResponseEntity.ok("All Product Page...");
		
	}
//	@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/product/byid")
	public ResponseEntity<String> productById(){
		return ResponseEntity.ok("Product By Id !!!!");
		
	}
}

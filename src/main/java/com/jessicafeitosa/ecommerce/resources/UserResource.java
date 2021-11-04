package com.jessicafeitosa.ecommerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jessicafeitosa.ecommerce.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999", "12345");
		
		return ResponseEntity.ok().body(u);
	}
	
	

}

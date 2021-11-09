package com.jessicafeitosa.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jessicafeitosa.ecommerce.entities.User;
import com.jessicafeitosa.ecommerce.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	//Tudo que for implementado dentro desse método
	//será executado quando chamar essa classe
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria", "maria@gmail.com", "9888898988", "123456");
		User u2 = new User(null, "João", "joao@gmail.com", "9888898988", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	

}

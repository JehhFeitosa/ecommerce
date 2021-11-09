package com.jessicafeitosa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicafeitosa.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

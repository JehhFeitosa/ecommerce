package com.jessicafeitosa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicafeitosa.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

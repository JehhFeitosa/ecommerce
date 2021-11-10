package com.jessicafeitosa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicafeitosa.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

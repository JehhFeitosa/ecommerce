package com.jessicafeitosa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicafeitosa.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.daniel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

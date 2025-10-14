package com.daniel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

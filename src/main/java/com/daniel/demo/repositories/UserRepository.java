package com.daniel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

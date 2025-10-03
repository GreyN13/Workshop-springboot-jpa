package com.gabrstudy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrstudy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
		
}

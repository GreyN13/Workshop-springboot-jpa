package com.gabrstudy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrstudy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
		
}

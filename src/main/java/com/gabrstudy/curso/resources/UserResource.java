package com.gabrstudy.curso.resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrstudy.curso.entities.User;

@RestController
@RequestMapping(value="/users")

public class UserResource {
	
	@GetMapping
 public ResponseEntity<User> findAll(){
	 User u = new User("Maria",1L,"Maria@gmail.com","123123123","1234");
	 return ResponseEntity.ok().body(u);
 }
}

package com.gabrstudy.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabrstudy.curso.entities.Order;
import com.gabrstudy.curso.entities.User;
import com.gabrstudy.curso.repositories.OrderRepository;
import com.gabrstudy.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
@Autowired
 private UserRepository UsRep;

@Autowired
 private OrderRepository OrRep;

@Override
public void run(String... args) throws Exception {
	User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
	User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

	UsRep.saveAll(Arrays.asList(u1,u2));
	
	Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), u1);
	Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:10Z"), u2);
	Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), u1);
	
	OrRep.saveAll(Arrays.asList(o1,o2,o3));
}
	
}

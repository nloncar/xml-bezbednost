package com.example.AdminModule.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminModule.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public <U extends User> Optional<U> findById(Long id);
	
	public <U extends User> Optional<U> findByEmailIgnoreCase(String email);

	public List<User> findAll();
	
	
	
	
	
}

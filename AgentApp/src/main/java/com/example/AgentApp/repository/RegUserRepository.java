package com.example.AgentApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.RegUser;


public interface RegUserRepository extends JpaRepository<RegUser, Long> {

	public List<RegUser> findAll();
	public <U extends RegUser> Optional<U> findByEmailIgnoreCase(String email);
	public void delete(RegUser ru);  
	

}

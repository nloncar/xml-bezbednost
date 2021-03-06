package com.example.AgentApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.AgentApp.model.User;

import com.example.AgentApp.repository.UserRepository;




@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	

	    public Optional<User> findById(Long id){
	    	return userRepository.findById(id);
	    } 
	 
	    public Optional<User> findByEmail(String e) {
			return userRepository.findByEmailIgnoreCase(e);
		} 
	    public User save(User u) {
			return userRepository.save(u);
		}
	 

}

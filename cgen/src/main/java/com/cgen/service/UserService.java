package com.cgen.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.cgen.model.User;
import com.cgen.model.UserDTO;
import com.cgen.model.UserType;
import com.cgen.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	
	public void registerUser(UserDTO userDTO) {
		byte[] salt = KeysGenerator.generateSalt();
		byte[] hash = KeysGenerator.hashPassword(userDTO.getPassword(), salt);
		
		User user = new User(userDTO.getUsername(), UserType.USER, salt, hash);
		
		try {			
			userRepository.save(user);
		} catch(Exception e) { 
			throw new RuntimeException("Username postoji!");
		}
	}
	
	public User getUser(UserDTO userDTO) {
		User user = userRepository.findByUsername(userDTO.getUsername());
		
		if (user == null) {
			throw new RuntimeException("Pogresan username ili lozinka!");
		} 
		
		byte[] passHash = KeysGenerator.hashPassword(userDTO.getPassword(), user.getPasswordSalt());
		
	    if (!Arrays.equals(passHash, user.getPasswordHash())) {
			throw new RuntimeException("Pogresan username ili lozinka!");
	    }
		
		return user;
	}
	
	
	
}

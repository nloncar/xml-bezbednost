package com.example.AdminModule.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminModule.model.RegUser;
import com.example.AdminModule.repository.RegUserRepository;


@Service
public class RegUserService {


	@Autowired
	private RegUserRepository regUserRepository;
	 
	
		public Optional<RegUser> findRegUserById(Long id) {
			return regUserRepository.findById(id);
		}  
	  
		public List<RegUser> findAll(){
	    	return regUserRepository.findAll();
	    }
	 
	   public void delete(RegUser d) {
	    	regUserRepository.delete(d);
		}
		
}
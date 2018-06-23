package com.example.AdminModule.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminModule.model.Admin;
import com.example.AdminModule.repository.AdminRepository;

 
@Service
public class AdminService { 

	
	@Autowired
	private AdminRepository adminRepository;

	public Optional<Admin> findOne(Long id) {
		return adminRepository.findById(id);
	}

	public Admin save(Admin a) {
		return adminRepository.save(a);
	}
	 public void delete(Admin d) {
		 adminRepository.delete(d);
		}
	
}

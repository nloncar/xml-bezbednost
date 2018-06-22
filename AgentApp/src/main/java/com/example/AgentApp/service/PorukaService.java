package com.example.AgentApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.AgentApp.model.Poruka;
import com.example.AgentApp.repository.PorukaRepository;



@Service
public class PorukaService {
	
	@Autowired
	private PorukaRepository porukaRepository;
	
	public Optional<Poruka> findById(Long id){
		return porukaRepository.findById(id);
	}
	
	
	public Poruka save(Poruka poruka) {
		return porukaRepository.save(poruka);
	}
	public void delete(Poruka poruka) {
		porukaRepository.delete(poruka);
	} 
	
}

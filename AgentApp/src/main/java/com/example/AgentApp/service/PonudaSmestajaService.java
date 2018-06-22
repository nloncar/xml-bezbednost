package com.example.AgentApp.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.AgentApp.model.PonudaSmestaja;
import com.example.AgentApp.repository.PonudaSmestajaRepository;




@Service
public class PonudaSmestajaService {

	
	private PonudaSmestajaRepository ponudaSmestajaRepository;
	
	 
	public Optional<PonudaSmestaja> findOne(Long idps) {
		
		return ponudaSmestajaRepository.findById(idps);
	}
	public PonudaSmestaja save(PonudaSmestaja ps) {
		
		return ponudaSmestajaRepository.save(ps);
	}
	public void delete(PonudaSmestaja ps) {
		
		ponudaSmestajaRepository.delete(ps);
	}
}

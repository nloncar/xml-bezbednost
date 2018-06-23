package com.example.AdminModule.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminModule.model.Smestaj;
import com.example.AdminModule.repository.SmestajRepository;


@Service
public class SmestajService {

	
	@Autowired
	private SmestajRepository smestajRepository;
	
	public Optional<Smestaj> findById(Long ids){
		return smestajRepository.findById(ids);
	}
	public List<Smestaj>getAll() {
		return smestajRepository.findAll();
	} 
	public Smestaj save(Smestaj s) {
		return smestajRepository.save(s);
	}
	 
	public List<Smestaj>getByLocation(String l) {
		return smestajRepository.findByLokacija(l);
	}
	
	
	
}

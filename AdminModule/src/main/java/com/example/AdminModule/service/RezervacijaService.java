package com.example.AdminModule.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminModule.model.Rezervacija;
import com.example.AdminModule.repository.RezervacijaRepository;


@Service
public class RezervacijaService {

	
	@Autowired
	private RezervacijaRepository rezervacijaRepository;
	
	public Optional<Rezervacija> findOne(Long idr) {
		
		return rezervacijaRepository.findById(idr);
	}

	public List<Rezervacija> findAll(){
		return rezervacijaRepository.findAll();
	}
	public Rezervacija save(Rezervacija r) {
		return rezervacijaRepository.save(r);
	} 
	public void delete(Long id ) { 
		 rezervacijaRepository.deleteById(id);
	}
	
	
}

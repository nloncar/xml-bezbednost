package com.example.AgentApp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.PonudaSmestaja;



public interface PonudaSmestajaRepository extends JpaRepository<PonudaSmestaja, Long> {
	
	List<PonudaSmestaja> findByIdSmestaj(Long idSmestaj);
	

}

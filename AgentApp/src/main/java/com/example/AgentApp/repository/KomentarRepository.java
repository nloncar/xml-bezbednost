package com.example.AgentApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.Komentar;




public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	 

	public List<Komentar> findAll();
	
}

package com.example.AgentApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.Komentar;




public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	 
	public <K extends Komentar> Optional<K> findById(Long id); 
	public List<Komentar> findAll();
	
}

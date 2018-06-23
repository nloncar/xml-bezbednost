package com.example.AdminModule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminModule.model.Komentar;




public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	 

	public List<Komentar> findAll();
	
}

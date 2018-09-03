package com.example.Admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Admin.model.Komentar;




public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	 

	public List<Komentar> findAll();
	
}

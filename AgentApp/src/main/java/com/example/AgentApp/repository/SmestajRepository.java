package com.example.AgentApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.Smestaj;

public interface SmestajRepository extends JpaRepository<Smestaj, Long>{


	public List<Smestaj> findByLokacija(String lokacija);

}

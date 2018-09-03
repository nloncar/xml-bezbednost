package com.example.Admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Admin.model.Smestaj;

public interface SmestajRepository extends JpaRepository<Smestaj, Long>{


	public List<Smestaj> findByLokacija(String lokacija);

}

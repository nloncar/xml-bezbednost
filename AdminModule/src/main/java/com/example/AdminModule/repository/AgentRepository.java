package com.example.AdminModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminModule.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}

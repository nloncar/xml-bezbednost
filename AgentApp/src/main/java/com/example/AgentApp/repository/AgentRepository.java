package com.example.AgentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AgentApp.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}

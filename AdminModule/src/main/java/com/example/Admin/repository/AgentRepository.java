package com.example.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Admin.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}

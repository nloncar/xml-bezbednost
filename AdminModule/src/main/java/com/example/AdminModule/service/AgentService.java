package com.example.AdminModule.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminModule.model.Agent;
import com.example.AdminModule.repository.AgentRepository;

 
@Service
public class AgentService { 

	
	@Autowired
	private AgentRepository agentRepository;

	public Optional<Agent> findOne(Long id) {
		return agentRepository.findById(id);
	}

	public Agent save(Agent a) {
		return agentRepository.save(a);
	}
	 public void delete(Agent d) {
		 agentRepository.delete(d);
		}
	
}

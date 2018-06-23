package com.example.AdminModule.conv;

import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
 

import com.example.AdminModule.dto.AgentDTO;
import com.example.AdminModule.model.Agent;
@Component
public class AgentDTOConverter implements Converter<AgentDTO,Agent>{

	//konvertovanje AgentDTO u Agent
	@Override
	public Agent convert(AgentDTO s) {
		Agent a = new Agent();
		a.setIme(s.getIme());
		a.setPrezime(s.getPrezime());
		a.setEmail(s.getEmail());
		a.setTelefon(s.getTelefon());
		a.setLozinka(s.getLozinka());
		a.setPmbr(s.getPmbr());
		
		return a;
	}
	
	
	
	
}

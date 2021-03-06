package com.example.Admin.conv;

import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
 

import com.example.Admin.dto.AgentDTO;
import com.example.Admin.model.Agent;
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

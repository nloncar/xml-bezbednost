package com.example.AgentApp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgentApp.WSclient;
import com.example.AgentApp.conv.SmestajDTOToSmestaj;
import com.example.AgentApp.conv.SmestajToSmestajDTO;
import com.example.AgentApp.dto.SmestajDTO;
import com.example.AgentApp.model.Smestaj;
import com.example.AgentApp.service.AgentService;
import com.example.AgentApp.service.PonudaSmestajaService;
import com.example.AgentApp.service.PorukaService;
import com.example.AgentApp.service.RezervacijaService;
import com.example.AgentApp.service.SmestajService;
import com.example.AgentApp.service.UserService;

import sema.wsdl.SmestajRequest;
import sema.wsdl.SmestajResponse;
import sema.wsdl.LoginRequest;
import sema.wsdl.LoginResponse;
import sema.wsdl.UserXML;
import sema.wsdl.TipSmestajXML;
import sema.wsdl.ImageXML;
import sema.wsdl.SmestajXML;


@RestController
@RequestMapping(value = "/agent")
public class AgentController {

	@Autowired 
	private AgentService agentService;
	@Autowired
	private SmestajService smestajService;
	
	@Autowired
	private SmestajDTOToSmestaj smestajDtoToSmestajConverter;
	
	
	
	
	@CrossOrigin
	@RequestMapping(
            value = "dodajSmestaj",
            method = RequestMethod.POST
    )
    public ResponseEntity<?> addSmestaj(@RequestBody SmestajDTO smestajDTO) throws IOException {
		if(smestajDTO.getNaziv().equals("") || smestajDTO.getNaziv() == null)	{ 
			return new ResponseEntity<>("Popuni polja!", HttpStatus.BAD_REQUEST);
		}
		
		SmestajResponse response  = WSclient.smestajWS(smestajDTO);
		Smestaj uneti = smestajDtoToSmestajConverter.convert(smestajDTO);
		if(response != null){
			Smestaj toSave = new Smestaj();
			SmestajXML smestajXML = new SmestajXML();
			smestajXML = response.getAccommodation();
			toSave.setId(smestajXML.getId());
			toSave.setNaziv(smestajXML.getNaziv());
			toSave.setLokacija(smestajXML.getLokacija());
			toSave.setOpis(smestajXML.getOpis());
			
			smestajService.save(toSave);
		
	        return new ResponseEntity<>(HttpStatus.CREATED);
		}

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
	
	
	
	
	
	
	
	
}

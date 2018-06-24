package com.example.AgentApp.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgentApp.conv.PonudaSmestajaToPonudaSmestajaDTO;
import com.example.AgentApp.conv.SmestajToSmestajDTO;
import com.example.AgentApp.dto.PonudaSmestajaDTO;
import com.example.AgentApp.dto.SmestajDTO;
import com.example.AgentApp.model.PonudaSmestaja;
import com.example.AgentApp.model.Smestaj;
import com.example.AgentApp.service.PonudaSmestajaService;
import com.example.AgentApp.service.SmestajService;

@RestController
@RequestMapping(value = "/smestaj")
public class SmestajController {

	
	@Autowired
	private SmestajService smestajService;
	
	@Autowired
	private PonudaSmestajaService ponudaSmestajaService;
	
	@Autowired
	private SmestajToSmestajDTO smestajToSmestajDTO;
	
	@Autowired
	private PonudaSmestajaToPonudaSmestajaDTO ponudaSmestajaToPonudaSmestajaDTO;
	
	
	@CrossOrigin
	@RequestMapping(
			value = "/getSmestaj/{idSmestaja}",
			method = RequestMethod.GET
	)
	public ResponseEntity<?> getSmestaj(@PathVariable Long idSmestaja) {
		Optional<Smestaj> smestaj = smestajService.findById(idSmestaja);
		
		if(smestaj.get()==null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Calendar cal = Calendar.getInstance();
		Date start = cal.getTime();
		
		
		List<PonudaSmestaja> ponude = ponudaSmestajaService.getByCurrentDateAndSmestajId(start, idSmestaja);
		SmestajDTO smestajDTO = smestajToSmestajDTO.convert(smestaj.get());
		List<PonudaSmestajaDTO> ponudeDTO = ponudaSmestajaToPonudaSmestajaDTO.convert(ponude);
		smestajDTO.setPonude(ponudeDTO);  
		return new ResponseEntity<>(smestajDTO,HttpStatus.OK);
	}
	
	
	
	
	
}

package com.example.AgentApp.controller;

import java.util.Calendar;
import java.util.Date;
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
import com.example.AgentApp.dto.PonudaSmestajaDTO;
import com.example.AgentApp.model.PonudaSmestaja;
import com.example.AgentApp.model.Rezervacija;
import com.example.AgentApp.service.PonudaSmestajaService;
import com.example.AgentApp.service.RezervacijaService;

@RestController
@RequestMapping(value = "/rezervacija")
public class RezervacijaController {

	@Autowired
	private RezervacijaService rezervacijaService;
	 

	@Autowired
	private PonudaSmestajaService ponudaSmestajaService;
	
	@Autowired
	private PonudaSmestajaToPonudaSmestajaDTO ponudaSmestajaToPonudaSmestajaDTO;
	
	
	@CrossOrigin
	@RequestMapping(
            value = "/rezervisi/{idPonudaSmestaja}",
            method = RequestMethod.POST
    )
	public ResponseEntity<?> reserve(@PathVariable Long idPonuda) {
		Optional<PonudaSmestaja> ponuda = ponudaSmestajaService.findOne(idPonuda);
		
		if(ponuda.get().getBrMesta()-ponuda.get().getBrZauzetih()>0){
			ponuda.get().setBrZauzetih(ponuda.get().getBrZauzetih()+1);
		}else{
			return new ResponseEntity<>("Nema slobodnih mesta!",HttpStatus.BAD_REQUEST);
		}
		Rezervacija rezervacija = new Rezervacija();
		Calendar calendar = Calendar.getInstance();
		Date datumRez = calendar.getTime();
		rezervacija.setDatumRez(datumRez);
		rezervacija.setPonudaSmestaja(ponuda.get());
	
		ponuda.get().getRezervacija().add(rezervacija);
		
		PonudaSmestaja ponudaRet = ponudaSmestajaService.save(ponuda.get());
		rezervacijaService.save(rezervacija);
		PonudaSmestajaDTO ponudaRetDTO = ponudaSmestajaToPonudaSmestajaDTO.convert(ponudaRet);
		return new ResponseEntity<>(ponudaRetDTO,HttpStatus.OK);
	}

	
	
	
	
	
	
	
}

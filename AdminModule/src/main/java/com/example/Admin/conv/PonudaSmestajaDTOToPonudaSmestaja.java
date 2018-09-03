package com.example.Admin.conv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;
	import org.springframework.stereotype.Component;

	import com.example.Admin.dto.PonudaSmestajaDTO;
	import com.example.Admin.model.PonudaSmestaja;
@Component
public class PonudaSmestajaDTOToPonudaSmestaja implements Converter<PonudaSmestajaDTO, PonudaSmestaja> {
	 
		
		@Override
		public PonudaSmestaja convert(PonudaSmestajaDTO s) {
			
			PonudaSmestaja ps = new PonudaSmestaja();
			ps.setId(s.getId());
			ps.setBrMesta(s.getBrMesta());
			ps.setBrZauzetih(s.getBrZauzetih());
			ps.setCena(s.getCena());
			DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
			ps.setDoD(df.format(s.getDoDat()));
			ps.setOdD(df.format(s.getOdDat()));
			ps.setIdSmestaj(s.getSmestaj().getId());
			ps.setNazivSmestaj(s.getSmestaj().getNaziv());
			 
			return ps;
	
		
	}

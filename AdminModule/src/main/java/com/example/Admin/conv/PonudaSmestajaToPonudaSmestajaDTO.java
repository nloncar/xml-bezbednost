package com.example.Admin.conv;

import org.springframework.stereotype.Component;

import com.example.Admin.dto.PonudaSmestajaDTO;
import com.example.Admin.model.PonudaSmestaja;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;


@Component
public class PonudaSmestajaToPonudaSmestajaDTO implements Converter<PonudaSmestaja, PonudaSmestajaDTO>{
	
	public List<PonudaSmestajaDTO> convert(List<PonudaSmestaja> s) {
		List<PonudaSmestajaDTO> psd = new ArrayList<PonudaSmestajaDTO>();
		for(PonudaSmestaja ps : s) {
			psd.add(convert(ps));
		}
		return psd;
	}
	@Override
	public PonudaSmestajaDTO convert(PonudaSmestaja s) {
		if(s != null) {
		
		PonudaSmestajaDTO ps = new PonudaSmestajaDTO();
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
		}else return null;
	}

}

package com.example.AdminModule.conv;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.AdminModule.dto.SmestajDTO;
import com.example.AdminModule.model.Smestaj;
@Component
public class SmestajDTOToSmestaj implements Converter<SmestajDTO, Smestaj> {
 
	
	@Override
	public Smestaj convert(SmestajDTO s) {
		
		Smestaj sm = new Smestaj();
		sm.setId(s.getId());
		sm.setNaziv(s.getNaziv());
		sm.setOpis(s.getOpis());
		sm.setLokacija(s.getLokacija());
		sm.setTipSmestaj(s.getTipSmestaj());
		sm.setKategorija(s.getKategorija());
		sm.setParking(s.isParking());
		sm.setWifi(s.isWifi());
		sm.setDorucak(s.isDorucak());
		sm.setPolupansion(s.isPolupansion());
		sm.setPansion(s.isPansion());
		sm.setTv(s.isTv());
		sm.setMiniKuhinja(s.isMiniKuhinja());
		sm.setKuhinja(s.isKuhinja()); 
		sm.setPrivatnoKupatilo(s.isPrivatnoKupatilo());
		 
		return sm;
	}

	
	
}

package com.example.Admin.conv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.Admin.dto.SmestajDTO;
import com.example.Admin.model.Smestaj;

@Component 
public class SmestajToSmestajDTO implements Converter<Smestaj, SmestajDTO> {
	
	public List<SmestajDTO> convert(List<Smestaj> s) {
		List<SmestajDTO> sd = new ArrayList<SmestajDTO>();
		for(Smestaj ss : s) {
			sd.add(convert(ss));
		} 
		return sd;
	}
	@Override
	public SmestajDTO convert(Smestaj s) {
		if(s != null) {

		SmestajDTO sd = new SmestajDTO();
		sd.setId(s.getId());
		sd.setNaziv(s.getNaziv());
		sd.setOpis(s.getOpis());
		sd.setLokacija(s.getLokacija());
		sd.setTipSmestaj(s.getTipSmestaj());
		sd.setKategorija(s.getKategorija());
		sd.setParking(s.isParking());
		sd.setWifi(s.isWifi());
		sd.setDorucak(s.isDorucak());
		sd.setPolupansion(s.isPolupansion());
		sd.setPansion(s.isPansion());
		sd.setTv(s.isTv());
		sd.setMiniKuhinja(s.isMiniKuhinja());
		sd.setKuhinja(s.isKuhinja()); 
		sd.setPrivatnoKupatilo(s.isPrivatnoKupatilo());
	
		return sd;
		
		}else return null;
	}
	
	



	
}

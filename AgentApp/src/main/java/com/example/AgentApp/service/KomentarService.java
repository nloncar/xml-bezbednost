package com.example.AgentApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgentApp.model.Komentar;
import com.example.AgentApp.repository.KomentarRepository;

@Service
public class KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;
	
	public Optional<Komentar> findById(Long id){
		return komentarRepository.findById(id);
	}
	public Komentar save(Komentar k) {
		return komentarRepository.save(k);
	}
	public List<Komentar> findAll(){
		
		return komentarRepository.findAll();
	}
	
	//svi neodobreni
	public List<Komentar> findAllKomentare(){
		List<Komentar> all = komentarRepository.findAll();
		List<Komentar> temp = null;
		for(Komentar k : all){
			if(k.isOdobren()){
				temp.add(k);
			}
		}
		return temp;
	}
	
	
}

package com.example.AgentApp.dto;

public class RezervacijaDTO {

	
	
	private Long id;
	private boolean uspesnaRez;
	private String datumRez;
	private PonudaSmestajaDTO ponudeDTO;
 
	
	public RezervacijaDTO() {
		
	}
	
	public RezervacijaDTO(PonudaSmestajaDTO ponudeDTO, Long id, boolean uspesnaRez, String datumRez) {
		super(); 
		this.ponudeDTO = ponudeDTO;
		this.id = id;
		this.uspesnaRez = uspesnaRez;
		this.datumRez = datumRez;
	}

	public Long getId() {
		return id;
	} 

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isUspesnaRez() {
		return uspesnaRez;
	}

	public void setUspesnaRez(boolean uspesnaRez) {
		this.uspesnaRez = uspesnaRez;
	}

	public String getDatumRez() {
		return datumRez;
	}

	public void setDatumRez(String datumRez) {
		this.datumRez = datumRez;
	}

	public PonudaSmestajaDTO getPonudeDTO() {
		return ponudeDTO;
	}

	public void setPonudeDTO(PonudaSmestajaDTO ponudeDTO) {
		this.ponudeDTO = ponudeDTO;
	}
	 
	
	
	
	
	
}

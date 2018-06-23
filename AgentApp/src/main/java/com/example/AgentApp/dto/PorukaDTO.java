package com.example.AgentApp.dto;


public class PorukaDTO {

	public PorukaDTO(Long id, String sadrzaj, boolean poslato, String datum, UserDTO posiljalac) {
		super();
		this.id = id;
		this.sadrzaj = sadrzaj;
		this.poslato = poslato;
		this.datum = datum;
		this.posiljalac = posiljalac;
	}
	private Long id;
	private String sadrzaj;
	private boolean poslato;
	private String datum;
	private UserDTO posiljalac;
	
	
	public PorukaDTO() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSadrzaj() {
		return sadrzaj;
	}


	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}


	public boolean isPoslato() {
		return poslato;
	}


	public void setPoslato(boolean poslato) {
		this.poslato = poslato;
	}


	public String getDatum() {
		return datum;
	}


	public void setDatum(String datum) {
		this.datum = datum;
	}


	public UserDTO getPosiljalac() {
		return posiljalac;
	}


	public void setPosiljalac(UserDTO posiljalac) {
		this.posiljalac = posiljalac;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

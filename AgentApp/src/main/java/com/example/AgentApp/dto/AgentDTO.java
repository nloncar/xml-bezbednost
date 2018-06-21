package com.example.AgentApp.dto;

public class AgentDTO {

	private Long id;
	private String ime;
	private String prezime;
	private String email;
	private String lozinka;
	private String telefon;
	private String pmbr;
	
	public AgentDTO() {
		
		
	}
	
	public AgentDTO(Long id, String ime, String prezime, String email, String lozinka, String telefon,
			String pmbr) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.lozinka = lozinka;
		this.telefon = telefon;
		this.pmbr = pmbr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getPmbr() {
		return pmbr;
	}

	public void setPmbr(String pmbr) {
		this.pmbr = pmbr;
	}
	
	
	
}

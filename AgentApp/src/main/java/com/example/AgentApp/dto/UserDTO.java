package com.example.AgentApp.dto;

public class UserDTO {

	
	public UserDTO() {
		
	}





	private Long id;
	private String email;
	private String ime;
	private String prezime;
	private String telefon;
	
	
	
	
	
	public UserDTO(Long id, String email, String ime, String prezime, String telefon) {
		super();
		this.id = id;
		this.email = email;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
	}





	public Long getId() {
		return id;
	}




 
	public void setId(Long id) {
		this.id = id;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
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





	public String getTelefon() {
		return telefon;
	}





	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
}

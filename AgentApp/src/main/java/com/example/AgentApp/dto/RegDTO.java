package com.example.AgentApp.dto;

public class RegDTO {

	
	public RegDTO(){
		
	}
	
	
	public RegDTO(String ime, String prezime, String email, String telefon, String password, String password2){
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.telefon = telefon;
		this.password = password;
		this.password2 = password2;
	}
	
	private String ime;
	private String prezime;
	private String email;
	private String telefon;
	private String password;
	private String password2;
	
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


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	
	
	
	
	
	
	
	
}

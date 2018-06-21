package com.example.AgentApp.dto;


public class PretraziDTO {

	
	private String mesto;
	private String odD;
	private String doD;
	private String brojOsoba;
	private String tipSmestaja;
	private String kategorija;
	
	public PretraziDTO() {
		
	}
	
	public PretraziDTO(String mesto,String odD,String doD,String brojOsoba,String tipSmestaja,String kategorija) {
		this.mesto=mesto;
		this.odD=odD;
		this.doD=doD;
		this.brojOsoba=brojOsoba;
		this.tipSmestaja=tipSmestaja;
		this.kategorija=kategorija;
		
	} 

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getOdD() {
		return odD;
	}

	public void setOdD(String odD) {
		this.odD = odD;
	}

	public String getDoD() {
		return doD;
	}

	public void setDoD(String doD) {
		this.doD = doD;
	}

	public String getBrojOsoba() {
		return brojOsoba;
	}

	public void setBrojOsoba(String brojOsoba) {
		this.brojOsoba = brojOsoba;
	}

	public String getTipSmestaja() {
		return tipSmestaja;
	}

	public void setTipSmestaja(String tipSmestaja) {
		this.tipSmestaja = tipSmestaja;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	
	
	
	
	
	
	
	
	
}

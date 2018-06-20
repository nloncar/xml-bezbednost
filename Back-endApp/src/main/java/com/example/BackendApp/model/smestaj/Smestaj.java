package com.example.BackendApp.model.smestaj;

public class Smestaj {

	
	private String drzava;
	private String mesto;
	private String ulica;
	private String opis;
	private int kapacitet;
	private TipSmestaj tip;
	private KategorijaSmestaj kategorija;
	//ostalo
	private boolean parking;
	private boolean wifi;
	private boolean dorucak;
	private boolean polupansion;
	private boolean pansion;
	private boolean tv;
	private boolean miniKuhinja;
	private boolean kuhinja;
	private boolean privatnoKupatilo;
	//+slike
	
	//+terminski plan cena
	
	
	
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public TipSmestaj getTip() {
		return tip;
	}
	public void setTip(TipSmestaj tip) {
		this.tip = tip;
	}
	public KategorijaSmestaj getKategorija() {
		return kategorija;
	}
	public void setKategorija(KategorijaSmestaj kategorija) {
		this.kategorija = kategorija;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isDorucak() {
		return dorucak;
	}
	public void setDorucak(boolean dorucak) {
		this.dorucak = dorucak;
	}
	public boolean isPolupansion() {
		return polupansion;
	}
	public void setPolupansion(boolean polupansion) {
		this.polupansion = polupansion;
	}
	public boolean isPansion() {
		return pansion;
	}
	public void setPansion(boolean pansion) {
		this.pansion = pansion;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isMiniKuhinja() {
		return miniKuhinja;
	}
	public void setMiniKuhinja(boolean miniKuhinja) {
		this.miniKuhinja = miniKuhinja;
	}
	public boolean isKuhinja() {
		return kuhinja;
	}
	public void setKuhinja(boolean kuhinja) {
		this.kuhinja = kuhinja;
	}
	public boolean isPrivatnoKupatilo() {
		return privatnoKupatilo;
	}
	public void setPrivatnoKupatilo(boolean privatnoKupatilo) {
		this.privatnoKupatilo = privatnoKupatilo;
	}
	
	
}

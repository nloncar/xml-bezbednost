package com.example.AdminModule.dto;

import java.util.ArrayList;

import com.example.AdminModule.model.Kategorija;
import com.example.AdminModule.model.TipSmestaj;

public class SmestajDTO {

	
	private Long id;
	
	private String naziv;
	private String lokacija;
	private String opis;
	private Kategorija kategorija;
	private TipSmestaj tipSmestaj;
	private ArrayList<PonudaSmestajaDTO> ponude;
	private boolean parking;
	private boolean wifi;
	private boolean dorucak;
	private boolean polupansion;
	private boolean pansion;
	private boolean tv;
	private boolean miniKuhinja;
	private boolean kuhinja;
	private boolean privatnoKupatilo;
	public SmestajDTO() {
		ponude = new ArrayList<PonudaSmestajaDTO>();
		
	}
	public SmestajDTO(Long id, String naziv,Kategorija kategorija,TipSmestaj tipSmestaj, String lokacija, String opis,boolean parking,boolean wifi,
			boolean dorucak,boolean polupansion,boolean pansion,boolean tv,boolean miniKuhinja,boolean kuhinja,boolean privatnoKupatilo) {
		ponude = new ArrayList<PonudaSmestajaDTO>();
		this.id = id;
		this.naziv = naziv;
		this.tipSmestaj = tipSmestaj;
		this.kategorija = kategorija;
		this.lokacija = lokacija;
		this.opis = opis;
		this.parking=parking;
		this.wifi = wifi;
		this.dorucak = dorucak;
		this.polupansion = polupansion;
		this.pansion = pansion;
		this.tv = tv;
		this.miniKuhinja = miniKuhinja;
		this.kuhinja=kuhinja;
		this.privatnoKupatilo=privatnoKupatilo;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	 
	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Kategorija getKategorija() {
		return kategorija;
	}
	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}
	public TipSmestaj getTipSmestaj() {
		return tipSmestaj;
	}
	public void setTipSmestaj(TipSmestaj tipSmestaj) {
		this.tipSmestaj = tipSmestaj;
	}
	public ArrayList<PonudaSmestajaDTO> getPonude() {
		return ponude;
	}
	public void setPonude(ArrayList<PonudaSmestajaDTO> ponude) {
		this.ponude = ponude;
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

package com.example.Admin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Smestaj")
@Entity
public class Smestaj {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 protected Long id;
	    
	 @XmlElement(required = true)
	 protected String naziv;
	
	 @XmlElement(required = true)
	 protected String lokacija;
	
	 @XmlElement(required = true)
	 protected String opis;
	
	 @XmlElement(name = "Ponuda", required = true)
	 @OneToMany(mappedBy = "smestaj", cascade = CascadeType.REMOVE)
	 protected List<PonudaSmestaja> ponude;
	     
	 @XmlElement(name = "Image", required = true)
	 @OneToMany(mappedBy = "smestaj", cascade = CascadeType.REMOVE)
	 protected List<Image> images;
	 @XmlElement(required = true)
	 private Kategorija kategorija;
	 @XmlElement(required = true)
	 private TipSmestaj tipSmestaj;
	    private boolean parking;
		private boolean wifi;
		private boolean dorucak;
		private boolean polupansion;
		private boolean pansion;
		private boolean tv;
		private boolean miniKuhinja;
		private boolean kuhinja;
		private boolean privatnoKupatilo;
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
		public List<PonudaSmestaja> getPonude() {
			return ponude;
		}
		public void setPonude(List<PonudaSmestaja> ponude) {
			this.ponude = ponude;
		}
		public List<Image> getImages() {
			return images;
		}
		public void setImages(List<Image> images) {
			this.images = images;
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

package com.example.Admin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegUser")
@Entity
public class RegUser extends User{

	public RegUser() {
		this.setUloga(Uloga.REGUSER);
	}
	public RegUser(Long id, String ime, String prezime, String email, String lozinka, String telefon, boolean blok) {
		super(id, ime, prezime, email, lozinka, telefon, Uloga.REGUSER);
		this.blok = blok;
	}
    

	@XmlAttribute(name = "blok")
    protected boolean blok;
	

	@OneToMany(mappedBy="user", cascade = CascadeType.REMOVE)
		private List<Rezervacija> rezervacije;
	
	
	
	
    public boolean isBlok() {
		return blok;
	}

	public void setBlok(boolean blok) {
		this.blok = blok;
	}

}

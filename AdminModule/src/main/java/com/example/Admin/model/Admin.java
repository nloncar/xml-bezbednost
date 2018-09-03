package com.example.Admin.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;





@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Admin")
@Entity
public class Admin extends User {

	public Admin() {
		this.setUloga(Uloga.ADMIN);
	}
	
	public Admin(Long id, String ime, String prezime, String email, String lozinka, String telefon) {
		super(id, ime, prezime, email, lozinka, telefon, Uloga.ADMIN);
	}
	
	
	
	
	
	
	
}

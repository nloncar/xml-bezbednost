package com.example.AgentApp.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "id",
    "ime",
    "prezime",
    "email",
    "lozinka",
    "telefon"
})
@XmlSeeAlso({
    RegUser.class,
    Agent.class,
    Admin.class
}) 
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    

	@XmlElement(required = true)
    protected String ime;
    @XmlElement(required = true)
    protected String prezime;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String lozinka;
    @XmlElement(required = true)
    protected String telefon;
    
    @Enumerated(EnumType.STRING)
    protected Uloga uloga;
    
    public User() {}

    public User(Long id, String ime, String prezime, String email, String lozinka, String telefon, Uloga uloga) {
	
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.lozinka = lozinka;
		this.telefon = telefon;
		this.uloga = uloga;
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

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

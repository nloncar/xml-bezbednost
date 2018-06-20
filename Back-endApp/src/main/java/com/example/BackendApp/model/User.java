package com.example.BackendApp.model;



import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(nullable = false, length = 13)
	@Pattern(regexp = "[0-9]{13}", message = "Oznaka JMBG-a mora imati 13 cifara.")
	
	private String jmbg;
	
	@Column(name = "name",nullable = false)
	@Size(max = 60)
	@Pattern(regexp = "[A-Z][a-z]*", message = "Ime mora imati veliko pocetno slovo.")
	private String name; 
	
	@Column(name = "surname",nullable = false)
	@Size(max = 60)
	@Pattern(regexp = "[A-Z][a-z]*", message = "Prezime mora imati veliko pocetno slovo.")
	private String surname;
	
	@Column(name = "adresa",nullable = false)
	@Size(max = 60)
	@Pattern(regexp = "[0-9a-zA-Z]+")

	private String adresa;
	
	@Column(name = "telefon",nullable = false)
	@Size(max = 20)

	@Pattern(regexp = "[0-9]{9,15}", message = "Telefon se sastoji od 9 do 15 cifara")


	private String telefon;

	@Column(name = "email",unique = true, nullable = false)
	@Size(max = 254)
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")

	private String email;

	//sta da radim sa delom tip klijenta?
	
	@Column(name = "password", nullable = false)
	@Size(min=8, max = 25)
	@Pattern(regexp = "[\\w]{8,25}")
	private String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		
	}
	public User(User user) {
		this.jmbg = user.jmbg;
		this.name = user.name;
		this.surname = user.surname;
		this.adresa = user.adresa;
		this.telefon = user.telefon;
		this.email = user.email;
		this.password=user.password;
	}
	public User(String jmbg, String name, String surname, String password, String adresa, String telefon, String email) {
		this.jmbg = jmbg;
		this.name = name;
		this.surname = surname;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.password=password;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

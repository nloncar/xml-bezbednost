package com.example.XML_BSEP.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;



@Entity
@Table(name="uloga")
public class Uloga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(unique = true, nullable = false)
	@Size(max = 30)
	private String name;
	
	@Column(name="dozvole")
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Dozvola> dozvole;

	public Uloga() {
		super();
		dozvole = new ArrayList<>();
		
	}
	
	

	public Uloga(Long id, String name, Collection<Dozvola> dozvole) {
		super();
		this.id = id;
		this.name = name;
		this.dozvole = dozvole;
	}



	public Uloga(String name) {
		super();
		this.name = name;
		dozvole = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Dozvola> getDozvola() {
		return dozvole;
	}

	public void setDozvola(Collection<Dozvola> dozvole) {
		this.dozvole = dozvole;
	}
	
	
}
package com.example.Admin.model;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
public class Rezervacija {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    protected Long id;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
 	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ponudaSmestajaId", nullable = false)
 	private PonudaSmestaja ponudaSmestaja;
	
	
	
	@XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date datumRez;
	
	protected boolean uspesnaRez;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PonudaSmestaja getPonudaSmestaja() {
		return ponudaSmestaja;
	}

	public void setPonudaSmestaja(PonudaSmestaja ponudaSmestaja) {
		this.ponudaSmestaja = ponudaSmestaja;
	}

	public Date getDatumRez() {
		return datumRez;
	}

	public void setDatumRez(Date datumRez) {
		this.datumRez = datumRez;
	}
 
	public boolean isUspesnaRez() {
		return uspesnaRez;
	}

	public void setUspesnaRez(boolean uspesnaRez) {
		this.uspesnaRez = uspesnaRez;
	}

	
	
}

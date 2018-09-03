package com.example.Admin.model;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "datumOd",
    "datumDo",
    "cena",
    "brMesta",
    "brZauzetih",
    "rezervacija",
    "usluga"
}) 
@Entity
public class PonudaSmestaja {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    protected Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "idSmestaj", nullable = false)
	 private Smestaj smestaj;

   
	@XmlElement(name = "Rezervacija", required = true)
    @OneToMany(mappedBy = "ponuda", cascade = CascadeType.REMOVE)
    protected List<Rezervacija> rezervacija;

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date odDat;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date doDat;
    
    @XmlElement(required = true)
    protected int cena;
    //@XmlElement(required = true)
    protected int brMesta;
   // @XmlElement(required = true)
    protected int brZauzetih;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Smestaj getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(Smestaj smestaj) {
		this.smestaj = smestaj;
	}
	public List<Rezervacija> getRezervacija() {
		return rezervacija;
	}
	public void setRezervacija(List<Rezervacija> rezervacija) {
		this.rezervacija = rezervacija;
	}
	public Date getOdDat() {
		return odDat;
	}
	public void setOdDat(Date odDat) {
		this.odDat = odDat;
	}
	public Date getDoDat() {
		return doDat;
	}
	public void setDoDat(Date doDat) {
		this.doDat = doDat;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getBrMesta() {
		return brMesta;
	}
	public void setBrMesta(int brMesta) {
		this.brMesta = brMesta;
	}
	public int getBrZauzetih() {
		return brZauzetih;
	}
	public void setBrZauzetih(int brZauzetih) {
		this.brZauzetih = brZauzetih;
	}
    
    
    
    
	
	
}

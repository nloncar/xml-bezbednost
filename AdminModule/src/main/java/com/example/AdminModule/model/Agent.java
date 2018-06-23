package com.example.AdminModule.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent")
@Entity
public class Agent extends User{


	@XmlAttribute(name = "pmbr")
    protected String pmbr;
    
	
	public Agent() {
    	this.setUloga(Uloga.AGENT);
    }
	 public Agent(Long id, String ime, String prezime, String email, String lozinka, String telefon, String pmbr) {
	    	super(id, ime, prezime, email, lozinka, telefon, Uloga.AGENT);
			this.pmbr = pmbr;
		}





	 public String getPmbr() {
			return pmbr;
		}
		public void setPmbr(String pmbr) {
			this.pmbr = pmbr;
		}






}

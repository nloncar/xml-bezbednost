package com.example.AgentApp.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "primalac",
    "posiljalac",
    "sadrzaj",
    "datumSlanja"  
}) 

@XmlRootElement(name = "Poruka")
public class Poruka {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	protected long id;

	@XmlElement(required = true)
	protected User primalac;
    @XmlElement(required = true)
    protected User posiljalac;
	
    @XmlElement(required = true)
    protected String sadrzaj;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date datumPoruke;

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getPrimalac() {
		return primalac;
	}
	public void setPrimalac(User primalac) {
		this.primalac = primalac;
	}
	public User getPosiljalac() {
		return posiljalac;
	}
	public void setPosiljalac(User posiljalac) {
		this.posiljalac = posiljalac;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	public Date getDatumPoruke() {
		return datumPoruke;
	}
	public void setDatumPoruke(Date datumPoruke) {
		this.datumPoruke = datumPoruke;
	}

	
}

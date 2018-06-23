package com.example.AdminModule.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "autor",
    "ocena",
    "smestaj"
})


@XmlRootElement(name = "Ocena")
public class Ocena {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
	
    protected int ocena;

	@XmlElement(name = "Smestaj", required = true)
    protected Smestaj smestaj;
    @XmlElement(required = true)
    protected RegUser autor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public Smestaj getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(Smestaj smestaj) {
		this.smestaj = smestaj;
	}
	public RegUser getAutor() {
		return autor;
	}
	public void setAutor(RegUser autor) {
		this.autor = autor;
	}
	
	
	
	
	
	
}

package com.example.AdminModule.model;

import java.util.Date;

import javax.persistence.Entity;
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
    "autor",
    "datumKomentara",
    "sadrzaj",
    "odobren"
}) 
@XmlRootElement(name = "Komentar")
@Entity
public class Komentar {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
	
	protected boolean odobren;
	
	@XmlElement(required = true)
    protected RegUser autor;
	
	@XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date datumKomentara;
	
	
	@XmlElement(required = true)
    protected String sadrzaj;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public boolean isOdobren() {
		return odobren;
	}


	public void setOdobren(boolean odobren) {
		this.odobren = odobren;
	}


	public Date getDatumKomentara() {
		return datumKomentara;
	}


	public void setDatumKomentara(Date datumKomentara) {
		this.datumKomentara = datumKomentara;
	}


	public String getSadrzaj() {
		return sadrzaj;
	}


	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	public RegUser getAutor() {
		return autor;
	}


	public void setAutor(RegUser autor) {
		this.autor = autor;
	}


	
	
   
	
	
	
	
	
	
	
	
	
	
	
}

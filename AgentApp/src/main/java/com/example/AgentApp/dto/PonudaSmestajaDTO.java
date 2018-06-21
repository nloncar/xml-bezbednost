package com.example.AgentApp.dto;

public class PonudaSmestajaDTO {

	private Long id;
	private String odD;
	private String doD;
	private int cena;
	private int brMesta;
    private int brZauzetih;
    private Long idSmestaj;
    private String nazivSmestaj;
	
    public PonudaSmestajaDTO() {
		
	}
	
    public PonudaSmestajaDTO(Long id, String odD, String doD, int cena, int brMesta, int brZauzetih,
			Long idSmestaj, String nazivSmestaj) {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOdD() {
		return odD;
	}

	public void setOdD(String odD) {
		this.odD = odD;
	}

	public String getDoD() {
		return doD;
	}

	public void setDoD(String doD) {
		this.doD = doD;
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

	public Long getIdSmestaj() {
		return idSmestaj;
	}

	public void setIdSmestaj(Long idSmestaj) {
		this.idSmestaj = idSmestaj;
	}

	public String getNazivSmestaj() {
		return nazivSmestaj;
	}

	public void setNazivSmestaj(String nazivSmestaj) {
		this.nazivSmestaj = nazivSmestaj;
	}
	
	
	
}

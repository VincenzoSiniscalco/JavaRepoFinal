package com.azienda.springioc.model;

public class Indirizzo {
	private String comune;
	private String strada;
	private Integer civico;
	public Indirizzo(String comune, String strada, Integer civico) {
		super();
		this.comune = comune;
		this.strada = strada;
		this.civico = civico;
	}
	
	public Indirizzo() {
		
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public Integer getCivico() {
		return civico;
	}

	public void setCivico(Integer civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "Indirizzo [comune=" + comune + ", strada=" + strada + ", civico=" + civico + "]";
	}
	
}

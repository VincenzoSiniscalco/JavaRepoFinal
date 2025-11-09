package com.azienda.esempioMvc3.controller;

public class ParametriInserimento {
	private String citta;
	private String via;
	private Integer civico;
	public ParametriInserimento() {
		
	}

	public ParametriInserimento(String citta, String via,Integer civico) {
		super();
		this.citta = citta;
		this.via = via;
		this.civico=civico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public Integer getCivico() {
		return civico;
	}

	public void setCivico(Integer civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "ParametriRicerca [citta=" + citta + ", via=" + via + "]";
	}
	
}

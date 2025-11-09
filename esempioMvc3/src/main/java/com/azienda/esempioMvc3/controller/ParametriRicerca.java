package com.azienda.esempioMvc3.controller;

public class ParametriRicerca {
	private String citta;
	private String via;
	
	public ParametriRicerca() {
		
	}

	public ParametriRicerca(String citta, String via) {
		super();
		this.citta = citta;
		this.via = via;
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

	@Override
	public String toString() {
		return "ParametriRicerca [citta=" + citta + ", via=" + via + "]";
	}
	
}

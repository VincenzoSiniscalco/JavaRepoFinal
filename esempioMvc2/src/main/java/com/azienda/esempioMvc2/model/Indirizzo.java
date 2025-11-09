package com.azienda.esempioMvc2.model;

import java.util.Objects;

public class Indirizzo {
	private String citta;
	private String via;
	private Integer civico;
	
	public Indirizzo() {
		
	}

	public Indirizzo(String citta, String via, Integer civico) {
		super();
		this.citta = citta;
		this.via = via;
		this.civico = civico;
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
		return "Indirizzo [citta=" + citta + ", via=" + via + ", civico=" + civico + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(citta, civico, via);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Indirizzo))
			return false;
		Indirizzo other = (Indirizzo) obj;
		return Objects.equals(citta, other.citta) && Objects.equals(civico, other.civico)
				&& Objects.equals(via, other.via);
	}
	
}

package com.azienda.esempioMvc3.controller;

public class ParametriUpdate {
	private String cittaDaAggiornare;
	private String viaDaAggiornare;
	private Integer civicoDaAggiornare;
	private String cittaAggiornata;
	private String viaAggiornata;
	private Integer civicoAggiornata;
	public ParametriUpdate() {
		
	}
	public ParametriUpdate(String cittaDaAggiornare, String viaDaAggiornare, Integer civicoDaAggiornare,
			String cittaAggiornata, String viaAggiornata, Integer civicoAggiornata) {
		super();
		this.cittaDaAggiornare = cittaDaAggiornare;
		this.viaDaAggiornare = viaDaAggiornare;
		this.civicoDaAggiornare = civicoDaAggiornare;
		this.cittaAggiornata = cittaAggiornata;
		this.viaAggiornata = viaAggiornata;
		this.civicoAggiornata = civicoAggiornata;
	}
	public String getCittaDaAggiornare() {
		return cittaDaAggiornare;
	}
	public void setCittaDaAggiornare(String cittaDaAggiornare) {
		this.cittaDaAggiornare = cittaDaAggiornare;
	}
	public String getViaDaAggiornare() {
		return viaDaAggiornare;
	}
	public void setViaDaAggiornare(String viaDaAggiornare) {
		this.viaDaAggiornare = viaDaAggiornare;
	}
	public Integer getCivicoDaAggiornare() {
		return civicoDaAggiornare;
	}
	public void setCivicoDaAggiornare(Integer civicoDaAggiornare) {
		this.civicoDaAggiornare = civicoDaAggiornare;
	}
	public String getCittaAggiornata() {
		return cittaAggiornata;
	}
	public void setCittaAggiornata(String cittaAggiornata) {
		this.cittaAggiornata = cittaAggiornata;
	}
	public String getViaAggiornata() {
		return viaAggiornata;
	}
	public void setViaAggiornata(String viaAggiornata) {
		this.viaAggiornata = viaAggiornata;
	}
	public Integer getCivicoAggiornata() {
		return civicoAggiornata;
	}
	public void setCivicoAggiornata(Integer civicoAggiornata) {
		this.civicoAggiornata = civicoAggiornata;
	}
	@Override
	public String toString() {
		return "ParametriUpdate [cittaDaAggiornare=" + cittaDaAggiornare + ", viaDaAggiornare=" + viaDaAggiornare
				+ ", civicoDaAggiornare=" + civicoDaAggiornare + ", cittaAggiornata=" + cittaAggiornata
				+ ", viaAggiornata=" + viaAggiornata + ", civicoAggiornata=" + civicoAggiornata + "]";
	}

	
	
}

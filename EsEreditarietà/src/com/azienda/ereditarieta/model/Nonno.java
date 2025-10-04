package com.azienda.ereditarieta.model;

public class Nonno {
	private String nomeNonno;
	public Nonno() {
		super();
		System.out.println("Costruttore di nonno");
	}
	public String getNomeNonno() {
		return nomeNonno;
	}
	public void setNomeNonno(String nomeNonno) {
		this.nomeNonno = nomeNonno;
	}
	
}

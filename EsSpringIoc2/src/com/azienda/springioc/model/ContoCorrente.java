package com.azienda.springioc.model;

public class ContoCorrente {
	private String numConto;
	private Banca banca;
	
	public ContoCorrente() {
		
	}

	public ContoCorrente(String numConto, Banca banca) {
		super();
		this.numConto = numConto;
		this.banca = banca;
	}

	public String getNumConto() {
		return numConto;
	}

	public void setNumConto(String numConto) {
		this.numConto = numConto;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	@Override
	public String toString() {
		return "ContoCorrente [numConto=" + numConto + ", banca=" + banca + "]";
	}
	
}

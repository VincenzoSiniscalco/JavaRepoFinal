package com.azienda.springioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContoCorrente implements ContoInterface{
	private String numConto;
	private Banca banca;

	public ContoCorrente() {

	}
	@Autowired 
	public ContoCorrente(@Value("12345678") String numConto,@Qualifier("banca") Banca banca) {
		super();
		this.numConto = numConto;
		this.banca = banca;
	}
	@Override
	public String getNumConto() {
		return numConto;
	}
	@Override
	public void setNumConto(String numConto) {
		this.numConto = numConto;
	}
	@Override
	public Banca getBanca() {
		return banca;
	}
	@Override
	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	@Override
	public String toString() {
		return "ContoCorrente [numConto=" + numConto + ", banca=" + banca + "]";
	}

}

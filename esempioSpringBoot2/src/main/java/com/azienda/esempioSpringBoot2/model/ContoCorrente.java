package com.azienda.esempioSpringBoot2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("contoComponent")
public class ContoCorrente implements ContoInterface{
	@Autowired
	@Value("12345678")
	private String numConto;
	@Autowired
	@Qualifier("bancaComponent")
	private Banca banca;

	public ContoCorrente() {

	}
	
	public ContoCorrente(String numConto,Banca banca) {
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
		return "ContoCorrente [numConto=" + numConto + ", banca=" + banca + " hashCode "+hashCode()+ "]";
	}

}

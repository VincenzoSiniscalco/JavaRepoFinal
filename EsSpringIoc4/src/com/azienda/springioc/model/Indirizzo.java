package com.azienda.springioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Indirizzo implements IndirizzoInterface{
	private String comune;
	private String strada;
	private Integer civico;
	@Autowired
	public Indirizzo(@Value("Roma") String comune,@Value("Via Colombo") String strada,@Value("1") Integer civico) {
		super();
		this.comune = comune;
		this.strada = strada;
		this.civico = civico;
	}

	public Indirizzo() {

	}
	@Override
	public String getComune() {
		return comune;
	}
	@Override
	public void setComune(String comune) {
		this.comune = comune;
	}
	@Override
	public String getStrada() {
		return strada;
	}
	@Override
	public void setStrada(String strada) {
		this.strada = strada;
	}
	@Override
	public Integer getCivico() {
		return civico;
	}
	@Override
	public void setCivico(Integer civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "Indirizzo [comune=" + comune + ", strada=" + strada + ", civico=" + civico + "]";
	}

}

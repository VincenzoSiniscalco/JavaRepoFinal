package com.azienda.esempioSpringBoot2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("indirizzoComponent")
public class Indirizzo implements IndirizzoInterface{
	@Autowired
	@Value("Roma") 
	private String comune;
	@Autowired 
	@Value("Via Colombo")
	private String strada;
	@Autowired 
	@Value("1")
	private Integer civico;
	
	public Indirizzo(String comune,String strada,Integer civico) {
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

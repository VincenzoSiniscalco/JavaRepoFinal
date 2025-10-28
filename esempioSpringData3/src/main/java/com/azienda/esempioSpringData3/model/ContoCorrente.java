package com.azienda.esempioSpringData3.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity 
public class ContoCorrente {

	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id;
	
	private String numeroConto;
	
	private Float saldo;
	
	@ManyToOne
	@JoinColumn(name="contoCorrente_banca")
	private Banca banca;
	
	@ManyToMany(mappedBy = "contiCorrente")
	
	private List<Persona> persone;
	
	public ContoCorrente() {
		
	}

	public ContoCorrente(String numeroConto, Float saldo, Banca banca, List<Persona> persone) {
		super();
		this.numeroConto = numeroConto;
		this.saldo = saldo;
		this.banca = banca;
		this.persone = persone;
	}

	public ContoCorrente(String numeroConto, Float saldo) {
		this.numeroConto=numeroConto;
		this.saldo=saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	public List<Persona> getPersone() {
		return persone;
	}

	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}

	@Override
	public String toString() {
		return "ContoCorrente id=" + id + ", numeroConto=" + numeroConto + ", saldo=" + saldo ;
	}
	
	
}

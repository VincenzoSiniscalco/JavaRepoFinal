package com.azienda.esempioSpringBoot2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bancaComponent")
public class Banca implements BancaInterface{
	@Autowired
	@Value("Unicredit") 
	private String nome;
	@Autowired
	@Qualifier("indirizzoComponent")
	private Indirizzo indirizzo;

	public Banca() {

	}
	
	public Banca(String nome,Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	@Autowired
	@Override
	public void setIndirizzo(@Qualifier("indirizzo")Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Banca [nome=" + nome + ", indirizzo=" + indirizzo + " hashcode " + hashCode()+"]";
	}

}

package com.azienda.springioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Banca implements BancaInterface{
	private String nome;
	private Indirizzo indirizzo;

	public Banca() {

	}
	@Autowired
	public Banca(@Value("Unicredit") String nome,@Qualifier("indirizzo") Indirizzo indirizzo) {
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
	@Override
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Banca [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}

}

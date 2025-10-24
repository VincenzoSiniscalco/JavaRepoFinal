package com.azienda.esempioSpringBoot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personaComponent")
public class Persona {
	private String nome;
	private String cognome;
	@Autowired
	public Persona(@Value("Laura") String nome,@Value("Verdi") String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}

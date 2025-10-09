package com.azienda.utilityjdk.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private int numFigli;
	private StatoCivile stato;
	
	public Persona(String nome, String cognome, LocalDate dataNascita, int numFigli, StatoCivile stato) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numFigli = numFigli;
		this.stato = stato;
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

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public int getNumFigli() {
		return numFigli;
	}

	public void setNumFigli(int numFigli) {
		this.numFigli = numFigli;
	}

	public StatoCivile getStato() {
		return stato;
	}

	public void setStato(StatoCivile stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita.format(FormatoData.dtf) + ", numFigli="
				+ numFigli + ", stato=" + stato + "]";
	}
	
}

package com.azienda.collections.model;

import java.util.Objects;


public class Studente{
	private String nome;
	private String cognome;
	private double mediaVoti;
	
	public Studente(String nome, String cognome, double media) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.mediaVoti = media;
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
	public double getMediaVoti() {
		return mediaVoti;
	}
	public void setMediaVoti(float mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
	
	@Override
	public String toString() {
		return "Lo studente " + nome + " " + cognome + " ha una media voto di " + mediaVoti + ".";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cognome, mediaVoti, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Studente))
			return false;
		Studente other = (Studente) obj;
		return Objects.equals(cognome, other.cognome)
				&& Double.doubleToLongBits(mediaVoti) == Double.doubleToLongBits(other.mediaVoti)
				&& Objects.equals(nome, other.nome);
	}
	
	
	
}

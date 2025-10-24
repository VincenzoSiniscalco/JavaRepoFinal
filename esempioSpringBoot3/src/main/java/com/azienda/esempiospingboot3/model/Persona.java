package com.azienda.esempiospingboot3.model;

import java.util.Objects;

public class Persona implements PersonaInterface{
	private Integer id;
	private String nome;
	private String cognome;
	
	public Persona() {
		
	}

	public Persona(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}
	
}

package com.azienda.ereditarieta.model;

import java.util.Objects;

public class Impiegato extends Persona {
	
	private String matricola;

	public Impiegato(String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Impiegato con codice identificativo " + matricola + ", (chiamata toString)" + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matricola);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Impiegato other = (Impiegato) obj;
		return Objects.equals(matricola, other.matricola);
	}
	
	
}

package com.azienda.ereditarieta.model;

import java.util.Objects;

public class Macchina {
	
	private String modello;
	private Persona proprietario;
	
	public Macchina(String modello, Persona proprietario) {
		super();
		this.modello = modello;
		this.proprietario = proprietario;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public Persona getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}
	
	@Override
	public String toString() {
		return "Macchina [modello=" + modello + ", proprietario=" + proprietario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(modello, proprietario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Macchina other = (Macchina) obj;
		return Objects.equals(modello, other.modello) && Objects.equals(proprietario, other.proprietario);
	}
	
	
	
}

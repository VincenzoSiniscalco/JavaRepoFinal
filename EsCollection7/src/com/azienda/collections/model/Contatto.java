package com.azienda.collections.model;

import java.util.Objects;

public class Contatto {
	private Persona persona;
	private String numeroTelefono;
	public Contatto(Persona persona, String numeroTelefono) {
		super();
		this.persona = persona;
		this.numeroTelefono = numeroTelefono;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	@Override
	public String toString() {
		return "\nContatto : " + persona.toString() + ",\t numero di telefono= " + numeroTelefono ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroTelefono, persona);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contatto))
			return false;
		Contatto other = (Contatto) obj;
		return Objects.equals(numeroTelefono, other.numeroTelefono) && Objects.equals(persona, other.persona);
	}
	
	
}

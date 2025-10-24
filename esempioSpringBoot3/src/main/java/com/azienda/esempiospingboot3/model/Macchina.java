package com.azienda.esempiospingboot3.model;

import java.util.Objects;

public class Macchina implements MacchinaInterface{
	private Integer id;
	private String modello;
	private Float cilindrata;
	
	public Macchina() {
		
	}

	public Macchina(String modello, Float cilindrata) {
		super();
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Float cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Macchina [id=" + id + ", modello=" + modello + ", cilindrata=" + cilindrata + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cilindrata, id, modello);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Macchina))
			return false;
		Macchina other = (Macchina) obj;
		return Objects.equals(cilindrata, other.cilindrata) && Objects.equals(id, other.id)
				&& Objects.equals(modello, other.modello);
	}
	
}

package com.azienda.collection.model;

import java.util.Objects;

public class Animale {
	private String nome;
	private String razza;
	
	public Animale(String nome, String razza) {
		super();
		this.nome = nome;
		this.razza = razza;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", razza=" + razza + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, razza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Animale))
			return false;
		Animale other = (Animale) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(razza, other.razza);
	}
	
}

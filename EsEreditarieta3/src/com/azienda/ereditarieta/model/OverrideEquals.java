package com.azienda.ereditarieta.model;

import java.util.Objects;

public class OverrideEquals {
	private String nome;
	private int numero;
	
	public OverrideEquals(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "OvverrideEquals [nome=" + nome + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverrideEquals other = (OverrideEquals) obj;
		return Objects.equals(nome, other.nome) && numero == other.numero;
	}
	
}

package com.azienda.utilityjdk.esempio4.model;

public class Abito {
	private String nome;
	private Stagione stagione;
	
	
	public Abito(String nome, Stagione stagione) {
		super();
		this.nome = nome;
		this.stagione = stagione;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Stagione getStagione() {
		return stagione;
	}
	public void setStagione(Stagione stagione) {
		this.stagione = stagione;
	}
	@Override
	public String toString() {
		return "Abito [nome=" + nome + ", stagione=" + stagione + "]"; 
	}
	
}

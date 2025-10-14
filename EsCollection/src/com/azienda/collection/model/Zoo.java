package com.azienda.collection.model;

import java.util.List;

public class Zoo {
	private String nome;
	private List<Animale> animali;
	
	public Zoo(String nome, List<Animale> animali) {
		super();
		this.nome = nome;
		this.animali = animali;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Animale> getAnimali() {
		return animali;
	}
	public void setAnimali(List<Animale> animali) {
		this.animali = animali;
	}
	
}

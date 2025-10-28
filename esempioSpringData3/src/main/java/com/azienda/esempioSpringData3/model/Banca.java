package com.azienda.esempioSpringData3.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Banca {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy = "banca")
	private List<ContoCorrente> contiCorrente;
	
	public Banca() {
		
	}
	public Banca(String nome, List<ContoCorrente> contiCorrente) {
		super();
		this.nome = nome;
		this.contiCorrente = contiCorrente;
	}


	public Banca(String nomeBanca) {
		nome=nomeBanca;
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

	public List<ContoCorrente> getContiCorrente() {
		return contiCorrente;
	}
	public void setContiCorrente(List<ContoCorrente> contiCorrente) {
		this.contiCorrente = contiCorrente;
	}
	@Override
	public String toString() {
		return "Banca id=" + id + ", nome=" + nome + ", contoCorrente= "+ contiCorrente ;
	}
	
}

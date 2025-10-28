package com.azienda.esempioSpringData3.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity 
public class Persona {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id;
	
	private String nome;
	
	private String cognome;
	
	@ManyToMany
	@JoinTable(name= "persona_conto",joinColumns = @JoinColumn(name="persona_id"),inverseJoinColumns =@JoinColumn(name ="conto_id") )
	private List<ContoCorrente> contiCorrente;
	
	public Persona() {
		
	}

	public Persona(String nome, String cognome, List<ContoCorrente> contiCorrente) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.contiCorrente = contiCorrente;
	}
	public Persona(String nome,String cognome) {
		this.nome=nome;
		this.cognome=cognome;
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

	public List<ContoCorrente> getContiCorrente() {
		return contiCorrente;
	}

	public void setContiCorrente(List<ContoCorrente> contiCorrente) {
		this.contiCorrente = contiCorrente;
	}

	@Override
	public String toString() {
		return "Persona id=" + id + ", nome=" + nome + ", cognome=" + cognome ;
	}
	
	
}

package com.azienda.esempioSpringData2.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Profilo {
	
	private String nome;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public final static String TIPO_ADMIN = "ADMIN";
	public final static String TIPO_USER = "USER";
	@OneToMany(mappedBy= "profilo")
	private List<Utente> utenti= new ArrayList<Utente>();
	
	public Profilo() {
		
	}

	public Profilo(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static String getTipoAdmin() {
		return TIPO_ADMIN;
	}

	public static String getTipoUser() {
		return TIPO_USER;
	}

	@Override
	public String toString() {
		return "Profilo [nome=" + nome + ", id=" + id + "]";
	}

	
}

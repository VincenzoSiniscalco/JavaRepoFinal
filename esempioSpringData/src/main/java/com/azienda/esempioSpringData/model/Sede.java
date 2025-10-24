package com.azienda.esempioSpringData.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String citta;
	@OneToMany(mappedBy = "sede")
	private List<Lavoratore> lavoratori= new ArrayList<Lavoratore>();
	
	public Sede() {
		
	}

	public Sede(String citta) {
		super();
		this.citta = citta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	

	public List<Lavoratore> getLavoratori() {
		return lavoratori;
	}

	public void setLavoratori(List<Lavoratore> lavoratori) {
		this.lavoratori = lavoratori;
	}

	@Override
	public String toString() {
		return "Sede [id=" + id + ", citta=" + citta + "]";
	}
	
	
}

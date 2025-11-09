package com.azienda.esempioRestClient.ui;

public class PersonaDTO {
	private Integer id;
	private String nome;
	private String cognome;
	
	public PersonaDTO() {
		
	}

	public PersonaDTO(Integer id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
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

	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}

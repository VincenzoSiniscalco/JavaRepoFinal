package com.azienda.classiBase.model.esercizio1;

public class Persona {
	private String nome;
	private String cognome;
	private float altezza;
	private static int contatorePersone;
	
	public Persona(String nome, String cognome, float altezza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.altezza = altezza;
		contatorePersone++;
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

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public static int getContatorePersone() {
		return contatorePersone;
	}

	public String stampaDescrizione() {
		if(getNome().equals(null)&&getCognome().equals(null)&&getAltezza()==0f) {
			return null;
		}
		return nome +" "+ cognome + " " + "è alto " +altezza+ " cm \n";
	}
	public void cresce(float f) {
		if(f<0) {
			System.err.println("L'incremento dev'essere positivo!");
		}else {
			setAltezza(f+getAltezza());
		}
	}
	
}

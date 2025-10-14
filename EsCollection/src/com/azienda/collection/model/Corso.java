package com.azienda.collection.model;

import java.util.Arrays;

public class Corso {
	private String docente;
	private String materia;
	private Persona[] studenti;
	public Corso(String docente, String materia, Persona[] studenti) {
		super();
		this.docente = docente;
		this.materia = materia;
		this.studenti = studenti;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Persona[] getStudenti() {
		return studenti;
	}
	public void setStudenti(Persona[] studenti) {
		this.studenti = studenti;
	}
	@Override
	public String toString() {
		return "Corso [docente=" + docente + ", materia=" + materia + ", studenti=" + Arrays.toString(studenti) + "]";
	}
	
	
}

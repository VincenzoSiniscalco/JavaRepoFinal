package com.azienda.classObject.model;

public class Corso {

	private String docente= "Pippo";
	private String materia;
	private String aula;
	private int crediti;

	{
		docente= "Pluto";
	}

	public Corso() {
		docente= "Paperino";
		materia= "Java";
		aula="Aula 2";
		crediti=10;
	}
	public Corso(String doc,String materia,String au,int crediti) {
		docente=doc;
		this.materia=materia;
		aula=au;
		this.crediti=crediti;
	}
	public Corso(String doc,String materia) {
		//		docente=doc;
		//		this.materia=materia;
		this(doc,materia,null,0);
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente=docente;
	}

	public int getCrediti() {
		return crediti;
	}
	
	public void setCrediti(int crediti) {
		this.crediti=crediti;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String getAula() {
		return aula;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}

	public int aumentaCrediti(int incremento) {
		if((crediti + incremento)>0) {
			crediti+=incremento;
			}
		return crediti;
	}

	public void setAll(String docente, String materia, String aula, int crediti) {
		this.docente = docente;
		this.materia = materia;
		this.aula = aula;
		this.crediti = crediti;
	}
	
	public String getAll() {
		return docente + " " + materia + " "+ aula + " "+ crediti;
	}
}

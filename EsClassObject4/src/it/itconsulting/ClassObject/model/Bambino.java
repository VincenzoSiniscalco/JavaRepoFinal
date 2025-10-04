package it.itconsulting.ClassObject.model;

import java.util.Scanner;

public class Bambino {
	private String nome;
	private String cognome;
	private float altezza;
	private static int contaBambini;

	public Bambino(String nome, String cognome, float altezza) {
		this.nome=nome;
		this.cognome=cognome;
		this.altezza=altezza;
		contaBambini++;
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
	public static int getContaBambini() {
		return contaBambini;
	}
	public static void stampaContatore() {
		if(contaBambini<=0) {
			System.err.println("Non ci sono bambini!");
		}else {
			System.out.println("Sono stati creati "+ getContaBambini() + " bambini.\n");
		}
	}

	public String infoBambino() {
		if(nome==null||cognome==null||altezza==0f) {
			return null;
		}
		return nome +" "+ cognome + " " + "è alto " +altezza+ " cm \n";
	}
	
	public void stampaInfoBambino() {
		System.out.println(infoBambino());
	}

	public void cresce(Scanner sc) {
		float incremento=sc.nextFloat();
		
		if(incremento<0) {
			System.err.println("L'incremento dev'essere positivo!");
		}else {
			altezza+=incremento;
		}
		
	}

}

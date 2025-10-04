package com.azienda.classObject.model;

public class EsempioStatic {
	
	public static String nomeStatico; //attributo valido per tutti gli oggetti della classe
	public String nome;
	
	public static void metodoStatico() {
		System.out.println("Metodo statico.");
		nomeStatico="Pippo";
	}
	public void metodo() {
		System.out.println("Metodo non statico");
		nomeStatico="Paperino";
		nome="Pluto";
	}
}

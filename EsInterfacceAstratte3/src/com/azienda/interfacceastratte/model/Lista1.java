package com.azienda.interfacceastratte.model;

public class Lista1 extends ListaAstratta{

	@Override
	public void aggiungi() {
		System.out.println("Lista 1 aggiungi");
	}

	@Override
	public void rimuovi() {
		System.out.println("Lista 1 rimuovi");
	}
	
}

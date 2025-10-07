package com.azienda.interfacceastratte.model;

public abstract class ListaAstratta implements Lista {
	@Override
	public void dimensione() {
		System.out.println("Dimensione della lista");		
	}
}

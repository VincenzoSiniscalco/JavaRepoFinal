package com.azienda.interfacceastratte.model;

public interface ListaDefault {
	public void aggiungi();
	public void rimuovi();
	
	public default void dimensione() {
		System.out.println("Dimensione della lista");
	}
}

package com.azienda.ereditarieta.model;

public class Televisore extends DispositivoMultimediale{

	private int numeroCanali;
	private int canaleSelezionato;



	public Televisore(String marca, String modello, float prezzo, int numeroCanali, int canaleSelezionato) {
		super(marca, modello, prezzo);
		this.numeroCanali = numeroCanali;
		this.canaleSelezionato = canaleSelezionato;
	}

	public int getNumeroCanali() {
		return numeroCanali;
	}

	public void setNumeroCanali(int numeroCanali) {
		this.numeroCanali = numeroCanali;
	}

	public int getCanaleSelezionato() {
		return canaleSelezionato;
	}

	public void cambiaCanale(int canale) {
		canaleSelezionato=canale;
	}
	@Override
	public String toString() {
		return super.toString() + " avente " + numeroCanali + " canali ed attualmente sintonizzato sul canale " + canaleSelezionato +".";
	}
}

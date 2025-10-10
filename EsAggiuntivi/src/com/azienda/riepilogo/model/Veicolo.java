package com.azienda.riepilogo.model;


import com.azienda.riepilogo.utilities.CalcolaTempi;


public abstract class Veicolo implements CalcolaTempi{
	
	private String modello;
	private float velocita;
	
	public Veicolo(String modello, float velocita) {
		super();
		this.modello = modello;
		this.velocita = velocita;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}
	
	@Override
	public float calcolaTempiPercorrenza(Veicolo v, float distanza) {
		
		return distanza/v.getVelocita();
	}
	@Override
	public abstract void informazioniMovimento(Veicolo v);
	}


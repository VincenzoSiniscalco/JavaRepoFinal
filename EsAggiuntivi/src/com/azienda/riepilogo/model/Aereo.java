package com.azienda.riepilogo.model;

import com.azienda.riepilogo.utilities.CalcolaTempi;

public class Aereo extends Veicolo implements CalcolaTempi{

	private boolean diLinea;
	
	public Aereo(String modello, float velocita, boolean diLinea) {
		super(modello, velocita);
		this.diLinea=diLinea;
		
	}
	
	public boolean isDiLinea() {
		return diLinea;
	}

	public void setDiLinea(boolean diLinea) {
		this.diLinea = diLinea;
	}

	public void vola() {
		if(diLinea) {
			System.out.println("L'aereo di linea "+ super.getModello() + " vola ad una velocità massima di " + super.getVelocita());
		}else {
			System.out.println("L'aereo non di linea "+ super.getModello() + " vola ad una velocità massima di " + super.getVelocita());
		}
		
	}
	
//	@Override
//	public float calcolaTempiPercorrenza(Veicolo v, float distanza) {
//		
//		return distanza/v.getVelocita();
//	}

	 @Override
	    public void informazioniMovimento(Veicolo v) {
	        if (diLinea)
	            System.out.println("L'aereo è di linea.");
	        else
	            System.out.println("L'aereo non è di linea.");
	    }
}

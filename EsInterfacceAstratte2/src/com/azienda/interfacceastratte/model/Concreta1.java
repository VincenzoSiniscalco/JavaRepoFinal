package com.azienda.interfacceastratte.model;

public class Concreta1 extends Astratta{

	@Override
	public void metodoAstratto() {
		System.out.println("Concreta1-metodo astratto");
		
	}
	public void specifico1() {
		System.out.println("Concreta1-specifico1");
	}

}

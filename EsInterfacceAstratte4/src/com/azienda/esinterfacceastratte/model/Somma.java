package com.azienda.esinterfacceastratte.model;

public class Somma extends OperazioneAstratta implements OperazioniAritmetiche {

	@Override
	public int operate(int a, int b) {
		
		return a+b;
	}

}

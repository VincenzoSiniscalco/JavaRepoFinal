package com.azienda.esinterfacceastratte.model;

public abstract class OperazioneAstratta implements OperazioniAritmetiche{
	@Override
	public void printResult(int result) {
		System.out.println("Il risultato è :" + result);
	}
}

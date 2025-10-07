package com.azienda.interfacceastratte.model;

public class Concreta2 extends Astratta{

	@Override
	public void metodoAstratto() {
		System.out.println("Concreta 2- metodo astratto");
	}
	@Override
	public void metodoConcreto() {
		System.out.println("Concreta 2- metodo concreto");
	}
	public void specifico2() {
		System.out.println("Concreta 2- specifico 2");
	}

}

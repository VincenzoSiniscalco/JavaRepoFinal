package com.azienda.interfacceastratte.model;

public abstract class Astratta {
	public abstract void metodoAstratto();
	public void metodoConcreto() {
		System.out.println("Astratta-metodo concreto");
	}
}

package com.azienda.lambda.esempio1.model;

public class Computer {
	private String modello;

	public Computer(String modello) {
		super();
		this.modello = modello;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public String toString() {
		return "Computer [modello=" + modello + "]";
	}
	
}

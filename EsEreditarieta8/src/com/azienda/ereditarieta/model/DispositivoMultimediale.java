package com.azienda.ereditarieta.model;

public class DispositivoMultimediale {
	private String marca;
	private String modello;
	private float prezzo;
	
	public DispositivoMultimediale(String marca, String modello, float prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		
		return "La marca del dispositivo è: " + marca + ", modello " + modello + ", venduto al prezzo di " + prezzo + " euro";
		
	}
	
}

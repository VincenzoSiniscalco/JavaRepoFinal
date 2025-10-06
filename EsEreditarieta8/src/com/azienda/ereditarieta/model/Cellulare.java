package com.azienda.ereditarieta.model;

public class Cellulare extends DispositivoMultimediale{
	
	private float megaPixelCamera;
	
	public Cellulare(String marca, String modello, float prezzo, float megaPixelCamera) {
		super(marca, modello, prezzo);
		this.megaPixelCamera = megaPixelCamera;
	}
	
	public float getMegaPixelCamera() {
		return megaPixelCamera;
	}

	public void setMegaPixelCamera(float megaPixelCamera) {
		this.megaPixelCamera = megaPixelCamera;
	}

	public void chiama() {
		System.out.println("Avvio chiamata...");
	}
	
	public void rispondi() {
		System.out.println("Sta squillando...");
	}
	@Override
	public String toString() {
		return super.toString() + " con una camera di " + megaPixelCamera + " megapixel.";
	}
}

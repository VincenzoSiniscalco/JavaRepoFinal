package com.azienda.classiBase.model.esercizio1;


public class Bambino extends Persona{
	
	private static int contatoreBambini;

	public Bambino(String nome, String cognome, float altezza) {
		super(nome,cognome,altezza);
		contatoreBambini++;
	}
	
	@Override
	public String toString() {
		if(super.getNome().equals(null)&&super.getCognome().equals(null)&&super.getAltezza()==0f) {
			return null;
		}
		return "Bambino :" + super.toString();
		}
	
	public void cresce(float f) {
		if(f<0) {
			System.err.println("L'incremento dev'essere positivo!");
		}else {
			setAltezza(f+getAltezza());
		}
	}

	public static int getContatoreBambini() {
	
		return contatoreBambini;
	}
}

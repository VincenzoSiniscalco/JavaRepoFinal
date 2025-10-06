package com.azienda.classiBase.model.esercizio1;


public class Bambino extends Persona{
	
	private static int contatoreBambini;

	public Bambino(String nome, String cognome, float altezza) {
		super(nome,cognome,altezza);
		contatoreBambini++;
	}
	public String getNome() {
		return super.getNome();
	}
	public void setNome(String nome) {
		super.setNome(nome);
	}
	public String getCognome() {
		return super.getCognome();
	}
	public void setCognome(String cognome) {
		super.setCognome(cognome);
	}
	public float getAltezza() {
		return super.getAltezza();
	}
	public void setAltezza(float altezza) {
		super.setAltezza(altezza);
	}
	public static int getContatoreBambini() {
		return contatoreBambini;
	}
	@Override
	public String stampaDescrizione() {
		if(super.getNome().equals(null)&&super.getCognome().equals(null)&&super.getAltezza()==0f) {
			return null;
		}
		return "Bambino :" +getNome() +" "+ getCognome() + " " + "è alto " +getAltezza()+ " cm \n";
	}
	
	public void cresce(float f) {
		super.cresce(f);
	}
}

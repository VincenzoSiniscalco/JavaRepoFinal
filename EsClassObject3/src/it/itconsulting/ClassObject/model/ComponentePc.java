package it.itconsulting.ClassObject.model;

public class ComponentePc {
	private String tipo;
	private String marca;
	private double prezzo;

	public ComponentePc(String tipo, String marca, double prezzo) {
		this.tipo=tipo;
		this.marca=marca;
		this.prezzo=prezzo;
	}
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String descrizione() {
		return tipo + " " + marca + " " + prezzo;
	}
	
	

}

package com.azienda.lambda.model;

import java.util.Objects;

public class Automobile {
	private String marca;
	private String modello;
	private int cilindrata;
	private String dataImmatricolazione;
	public Automobile(String marca, String modello, int cilindrata, String dataImmatricolazione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.dataImmatricolazione = dataImmatricolazione;
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
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getDataImmatricolazione() {
		return dataImmatricolazione;
	}
	public void setDataImmatricolazione(String dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}
	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", dataImmatricolazione=" + dataImmatricolazione + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cilindrata, dataImmatricolazione, marca, modello);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Automobile))
			return false;
		Automobile other = (Automobile) obj;
		return cilindrata == other.cilindrata && Objects.equals(dataImmatricolazione, other.dataImmatricolazione)
				&& Objects.equals(marca, other.marca) && Objects.equals(modello, other.modello);
	}
	
	
	
}

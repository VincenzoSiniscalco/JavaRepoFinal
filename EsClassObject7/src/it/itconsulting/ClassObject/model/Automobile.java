package it.itconsulting.ClassObject.model;

public class Automobile {
	private String modello;
	private String marca;
	private String targa;
	private int cilindrata;
	private Fabbrica fabbrica;

	public Automobile(String modello, String marca, String targa, int cilindrata, Fabbrica fabbrica) {
		this.modello = modello;
		this.marca = marca;
		this.targa = targa;
		this.cilindrata = cilindrata;
		this.fabbrica = fabbrica;
		if(this.fabbrica!=null) {
			fabbrica.produciAuto();
		}
	}

	public String infoAutomobile() {
		return "Modello: "+ modello + "\n-marca: " + marca + "\n-targa: " + targa + "\n-cilindrata: " +  cilindrata + " cc "+ "\n-prodotta da: "+ fabbrica.infoFabbrica();
	}
}

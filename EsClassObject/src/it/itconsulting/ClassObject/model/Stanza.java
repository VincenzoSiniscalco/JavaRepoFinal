package it.itconsulting.ClassObject.model;

public class Stanza {
	private String nome;
	private String colore;
	private float metriQuadri;
	private float altezza;
	
	public Stanza(String nome, String colore, float metriQuadri, float altezza) {
		this.nome=nome;
		this.colore=colore;
		this.metriQuadri=metriQuadri;
		this.altezza=altezza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public float getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(float metriQuadri) {
		this.metriQuadri = metriQuadri;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	
	public void incrementaMetriQuadri(float incremento) {
		if((metriQuadri+=incremento)<0) {
			System.err.println("La grandezza in questo modo è negativa!");
		}
		metriQuadri+=incremento;
		
	}
	public float incrementaAltezza(float incremento) {
		if((altezza+incremento)>0) {
		altezza+=incremento;
		}
		return altezza;
		
	}
	public String stampaStanza() {
		return nome + " " + colore + " di " + metriQuadri + " metri quadri ed alta "+ altezza + " metri";
	}
	
}

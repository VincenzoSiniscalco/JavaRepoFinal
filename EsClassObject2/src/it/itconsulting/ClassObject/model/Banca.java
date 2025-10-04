package it.itconsulting.ClassObject.model;

public class Banca {
	private String nome;
	private Indirizzo indirizzo;

	public Banca(String nome, Indirizzo indirizzo) {
		this.nome=nome;
		this.indirizzo=indirizzo;
	}

	public String descrizione() {
		if(indirizzo==null||nome==null) {
			return null;
		}else {
			return nome + " " + indirizzo.descrizione();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

}

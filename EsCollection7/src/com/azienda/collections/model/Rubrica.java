package com.azienda.collections.model;

import java.util.List;
import java.util.Objects;

public class Rubrica {
	private String nome;
	private String anno;
	private List<Contatto> contatti;
	public Rubrica(String nome, String anno, List<Contatto> contatti) {
		super();
		this.nome = nome;
		this.anno = anno;
		this.contatti = contatti;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public List<Contatto> getContatti() {
		return contatti;
	}
	public void setContatti(List<Contatto> contatti) {
		this.contatti = contatti;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anno, contatti, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rubrica))
			return false;
		Rubrica other = (Rubrica) obj;
		return Objects.equals(anno, other.anno) && Objects.equals(contatti, other.contatti)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Rubrica [nome=" + nome + ", anno=" + anno + ", contatti=" + contatti + "]";
	}
	
	
	
	
}

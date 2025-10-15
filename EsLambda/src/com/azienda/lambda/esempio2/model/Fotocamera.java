package com.azienda.lambda.esempio2.model;

public class Fotocamera implements Comparable<Fotocamera>{
	private String modello;
	private Integer anno;
	private Float megapixel;
	
	
	public Fotocamera(String modello, Integer anno, Float megapixel) {
		super();
		this.modello = modello;
		this.anno = anno;
		this.megapixel = megapixel;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public Float getMegapixel() {
		return megapixel;
	}
	public void setMegapixel(Float megapixel) {
		this.megapixel = megapixel;
	}
	@Override
	public String toString() {
		return "Fotocamera [modello=" + modello + ", anno=" + anno + ", megapixel=" + megapixel + "]";
	}
	@Override
	public int compareTo(Fotocamera o) {
		
		return anno.compareTo(o.getAnno());
	}
	
	
}

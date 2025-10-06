package com.azienda.classiAvanzate.parteB.esercizi.a;

import java.util.Objects;

public class B extends A {
	private String s;
	private float f;
	
	public B(String s, int i, float f) {
		super(s, i);
		this.f = f;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}
	public String getParentS() {
		return super.getS();
	}
	
	public void setParentS(String s) {
		super.setS(s);
	}

	@Override
	public String toString() {
		return super.toString() + "Stringa s(child) " + s + " , float: " + f +"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(f, s);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof B))
			return false;
		B other = (B) obj;
		return Float.floatToIntBits(f) == Float.floatToIntBits(other.f) && Objects.equals(s, other.s);
	}
	
	
}

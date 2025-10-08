package com.azienda.exception2.model;

public class Divisione {
	public static int divisioneChecked(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception();
		}
		return a/b;
	}
	public static int divisioneUnchecked(int a, int b) {
		if(b==0) {
			throw new RuntimeException();
		}
		return a/b;
	}
	public static int divisioneChecked2(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception("Il secondo operando non può essere zero!");
		}
		return a/b;
	}
	public static int divisioneChecked3(int a, int b) throws Exception{
		try {
			return a/b;
		}catch(ArithmeticException e) {
			throw new Exception("Il secondo operando non può essere zero! ", e);
		}
	}
}

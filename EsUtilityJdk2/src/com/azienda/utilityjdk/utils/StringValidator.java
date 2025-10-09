package com.azienda.utilityjdk.utils;

import com.azienda.utilityjdk.exceptions.StringLenghtException;

public class StringValidator {
	public static void check(String s) throws StringLenghtException {
		if(s.length()<8) {
			throw new StringLenghtException("La stringa inserita è minore di 8 caratteri!",null);
		}
	}
}

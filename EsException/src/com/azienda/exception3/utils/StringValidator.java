package com.azienda.exception3.utils;

import com.azienda.exception3.exception.StringaTroppoCortaException;

public class StringValidator {
	public static void check(String s) throws StringaTroppoCortaException {
		if(s.length()<8) {
			throw new StringaTroppoCortaException("La stringa "+s+" ha meno di 8 caratteri ", null);
		}
	}
}

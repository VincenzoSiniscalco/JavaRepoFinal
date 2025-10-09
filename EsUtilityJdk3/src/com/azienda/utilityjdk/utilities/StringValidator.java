package com.azienda.utilityjdk.utilities;

import com.azienda.utilityjdk.exception.VoidStringException;


public class StringValidator {
	public static void check(String s) throws VoidStringException {
		if(s.equals("")) {
			throw new VoidStringException("Il campo non può essere vuoto!", null);
		}
	}
}

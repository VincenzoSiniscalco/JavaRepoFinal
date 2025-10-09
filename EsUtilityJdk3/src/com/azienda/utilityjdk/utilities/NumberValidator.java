package com.azienda.utilityjdk.utilities;

import com.azienda.utilityjdk.exception.NegativeNumberException;

public class NumberValidator {
	public static int check(String s) throws NegativeNumberException {
		try {
			int i= Integer.parseInt(s);
			if(i<0) {
				throw new NegativeNumberException("Il numero inserito è minore di zero!",null);
			}
			return i;
		} catch (NumberFormatException e) {
			throw new NegativeNumberException("La stringa non è un numero!",null);
		}
		
	}
}
package com.azienda.utilityjdk.utilities;

import com.azienda.utilityjdk.exception.InvalidEnumException;
import com.azienda.utilityjdk.model.StatoCivile;

public class EnumValidator {
	public static StatoCivile check(String s) throws InvalidEnumException{
		try {
			return StatoCivile.valueOf(s);
		} catch (Exception e) {
			throw new InvalidEnumException("errore",null);
		}
		
	}
}
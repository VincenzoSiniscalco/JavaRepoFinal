package com.azienda.riepilogo.utilities;

import com.azienda.riepilogo.exception.IsFloatException;

public class FloatValidator {
	public static float checkFloat(String f) throws IsFloatException {
		try{
			float f1=Float.parseFloat(f);
			return f1;
		}catch(NumberFormatException e) {
			throw new IsFloatException("Il numero non è un float!",null);
		}
	}
}

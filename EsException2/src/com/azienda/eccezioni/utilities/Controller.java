package com.azienda.eccezioni.utilities;

import com.azienda.eccezioni.exception.NegativeNumberException;
import com.azienda.eccezioni.exception.NumberIsZeroException;

public class Controller {
	public static void checkPositive(int i) throws NegativeNumberException{
		if(i<0) {
			throw new NegativeNumberException("Il numero inserito è minore di zero!",null);
		}
	}
	public static void checkNotZero(int i) throws NumberIsZeroException{
		if(i==0) {
			throw new NumberIsZeroException("Il numero inserito è zero!", null);
		}
	}
}

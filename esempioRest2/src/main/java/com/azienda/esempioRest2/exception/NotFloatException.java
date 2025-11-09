package com.azienda.esempioRest2.exception;

public class NotFloatException extends Exception {

	public NotFloatException(String message, Throwable cause) {
		super("Il numero non è del formato corretto (float)!", cause);
		
	}
	
}

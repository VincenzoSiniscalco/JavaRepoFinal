package com.azienda.esempioRest2.exception;

public class LocalitaAlreadyExistsException extends Exception {

	public LocalitaAlreadyExistsException(String message, Throwable cause) {
		super("La località esiste già!", cause);
		
	}
		
}

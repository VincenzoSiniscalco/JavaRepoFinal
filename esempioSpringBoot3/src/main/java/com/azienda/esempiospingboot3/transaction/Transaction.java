package com.azienda.esempiospingboot3.transaction;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
	public void commit() {
		System.out.println("Commit eseguito con successo.");
	}
	public void rollback() {
		System.out.println("Rollback eseguito.");
	}
}

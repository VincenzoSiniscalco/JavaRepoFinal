package com.azienda.interfacceAstratte.model;

public class OracleDbConnection implements DbConnection{

	@Override
	public void open() {
		System.out.println("Oracle open connection...");
		
	}

	@Override
	public void close() {
		System.out.println("Oracle close connection...");
		
	}

	public void oracleQuery() {
		System.out.println("Oracle Query...");
	}

}

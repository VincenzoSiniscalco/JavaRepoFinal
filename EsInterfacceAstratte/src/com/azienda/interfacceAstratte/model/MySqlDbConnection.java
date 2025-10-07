package com.azienda.interfacceAstratte.model;

public class MySqlDbConnection implements DbConnection{

	@Override
	public void open() {
		System.out.println("MySQL open connection");
		
	}

	@Override
	public void close() {
		System.out.println("MySQL close connection");
		
	}

	public void mySqlQuery() {
		System.out.println("MySQL query");
	}
	
	@Override
	public void openTransaction() {
		
		System.out.println("MySQL open transaction");
	}
	
}

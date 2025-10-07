package com.azienda.interfacceAstratte.model;

public interface DbConnection {
	
	public void open();
	public void close();
	
	public default void openTransaction() {
		System.out.println("Default open transaction");
	}
	public static void test() {
		System.out.println("static test");
	}
}

package com.azienda.interfacceAstratte.ui;

import com.azienda.interfacceAstratte.model.DbConnection;
import com.azienda.interfacceAstratte.model.MySqlDbConnection;
import com.azienda.interfacceAstratte.model.OracleDbConnection;

public class TestDbConnection {

	public static void main(String[] args) {

		DbConnection con = new OracleDbConnection();
		
		con.open();
		con.close();
		con.openTransaction();
		((OracleDbConnection)con).oracleQuery();
		
		con= new MySqlDbConnection();
		
		con.open();
		con.close();
		con.openTransaction();
		((MySqlDbConnection)con).mySqlQuery();
		DbConnection.test();
	
	}

	private static void metodo1(DbConnection db) {
		db.open();
		db.close();
	}
	
	private static void metodo2(OracleDbConnection db) { //SBAGLIATO
		db.open();
		db.close();
	}
	private static void metodo3(DbConnection db) {
		db.open();
		db.close();
		if(db instanceof OracleDbConnection) {
			((OracleDbConnection)db).oracleQuery();
		}
	}
	private static void metodo4(OracleDbConnection db) {
		db.open();
		db.close();
		db.oracleQuery();
	}
	
	
}

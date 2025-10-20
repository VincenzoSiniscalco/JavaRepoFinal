package com.azienda.jdbc.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.azienda.jdbc.model.Persona;
import com.azienda.jdbc.repository.PersonaRepository;
import com.azienda.jdbc.service.Servizio;

public class TestJdbc2 {

	public static void main(String[] args) throws SQLException {

		Connection con=null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/esempio_jdbc?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbUser = "root";
			String dbPassword = "Asdrubale150162";
			Class.forName(driverName);
			con = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			con.setAutoCommit(false);
		// CREAZIONE DEI SECONDI LIVELLI (DAO/REPOSITORY)
			PersonaRepository personaRepository= new PersonaRepository(con);
		// CREAZIONE DEL TERZO LIVELLO
			Servizio servizio= new Servizio(personaRepository, con);
		// FINE INIZIALIZZAZIONE, INIZIO OPERATIVITA'
			
			
			servizio.deleteParametric(11);
			servizio.insertParametric("Mario", "Rossi");
			servizio.insertParametric("Laura", "Verdi");
			servizio.updateParametric("Carlo", "Bianchi", 13);
			
			List<Persona> persone= servizio.search();
			System.out.println("\n Elenco persone:");
			persone.forEach(System.out::println);


			System.out.println("Programma terminato.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) con.close();
		}

	}
	
}

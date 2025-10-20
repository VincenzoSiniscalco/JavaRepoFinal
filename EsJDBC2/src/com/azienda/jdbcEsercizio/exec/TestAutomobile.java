package com.azienda.jdbcEsercizio.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.azienda.jdbcEsercizio.businesslogic.Service;
import com.azienda.jdbcEsercizio.dao.AutomobileRepository;
import com.azienda.jdbcEsercizio.model.Automobile;

public class TestAutomobile {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		boolean running=true;
		Scanner sc= new Scanner(System.in);
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/eserciziojdbc?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbUser = "root";
			String dbPassword = "Asdrubale150162";
			Class.forName(driverName);
			con = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			con.setAutoCommit(false);
			
			AutomobileRepository automobileRepository= new AutomobileRepository(con);
			Service service= new Service(automobileRepository, con);
			
			
			while (running) {
				System.out.println("\n--- MENU ---");
				System.out.println("1: Inserisci automobile");
				System.out.println("2: Cancella automobile");
				System.out.println("3: Aggiornamento automobile");
				System.out.println("4: Stampa elenco auto");
				System.out.println("Digitare 'esc' per uscire");
				System.out.print("Seleziona operazione: ");

				String scelta = sc.nextLine().trim();

				if (scelta.equalsIgnoreCase("esc")) {
					running = false;
					System.out.println("Programma terminato.");
					continue;
				}
				boolean inputCorretto = false;
				while (!inputCorretto) {
					try {
						switch (scelta) {
						case "1" -> {
							System.out.println("Inserire i campi per la nuova auto:");
							System.out.println("Inserire la marca:");
							String marca=sc.nextLine();
							System.out.println("Inserire il modello:");
							String modello=sc.nextLine();
							System.out.println("Inserire la targa:");
							String targa=sc.nextLine();
							System.out.println("Inserire il colore:");
							String colore=sc.nextLine();
							System.out.println("Inserire la cilindrata:");
							String cilindrata=sc.nextLine();
							Float cil=Float.parseFloat(cilindrata);
							
							service.insertParametric(marca,modello,targa,colore,cil);
						}
						case "2" -> {
							System.out.println("Inserire la stringa da cercare per la cancellazione (anche parziale):");
							String s=sc.nextLine();
							
							service.deleteParametric(s);
						}
						case "3" -> {
							System.out.println("Inserire la stringa per l'update delle targhe (anche parziale):");
							String s=sc.nextLine();
							System.out.println("Inserire la nuova targa:");
							String targa=sc.nextLine();
							service.updateParametric(s,targa);
						}
						case "4" -> {
							System.out.println("Stampa di tutte le auto presenti nel database:");
							List<Automobile> automobili=service.search();
							for (Automobile automobile : automobili) {
								System.out.println(automobile);
							}
						}
						default -> {
							System.out.println("Opzione non valida, riprova.");
							break;
							}
						}
						inputCorretto = true;
					} catch (SQLException e) {
						System.out.println(e.getMessage());
						inputCorretto = true;
					
					} catch (Exception e) {
						System.out.println("Si è verificato un errore imprevisto: " + e.getMessage());
						inputCorretto=true;
					}
				}
			}
			sc.close();
//		
//		service.insertParametric("Fiat", "500" ,"IT567AL", "Bianca", 500f);
////			service.insertParametric("Audi", "A8" ,"LM098HB", "Nera", 1800f);
////			service.insertParametric("Alfa Romeo", "156" ,"EB987SC", "Rossa", 2000f);
////			service.insertParametric("Mini", "Cooper S" ,"SB784DX", "Verde", 1500f);
////			service.insertParametric("Toyota", "Yaris" ,"JP923FR", "Gialla", 1200f);
////			service.deleteParametric("F");
//			service.updateParametric("F","AZ123CV");
//			List<Automobile> automobili= service.search();
//			System.out.println("Elenco automobili:");
//			automobili.forEach(System.out::println);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) con.close();
		}
	}
}

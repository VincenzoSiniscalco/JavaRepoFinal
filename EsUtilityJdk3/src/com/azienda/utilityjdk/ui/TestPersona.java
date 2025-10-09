package com.azienda.utilityjdk.ui;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.azienda.utilityjdk.exception.DateFormatException;
import com.azienda.utilityjdk.exception.InvalidEnumException;
import com.azienda.utilityjdk.exception.NegativeNumberException;
import com.azienda.utilityjdk.exception.VoidStringException;
import com.azienda.utilityjdk.model.Persona;
import com.azienda.utilityjdk.model.StatoCivile;
import com.azienda.utilityjdk.utilities.DateValidator;
import com.azienda.utilityjdk.utilities.EnumValidator;
import com.azienda.utilityjdk.utilities.NumberValidator;
import com.azienda.utilityjdk.utilities.StringValidator;

public class TestPersona {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			try {
				System.out.println("Inserire il nome della persona: ");
				String nome= sc.nextLine();
				StringValidator.check(nome);
				
				System.out.println("Inserire il cognome della persona: ");
				String cognome= sc.nextLine();
				StringValidator.check(cognome);
				
				System.out.println("Inserire la data di nascita nel formato dd/MM/yyyy");
				String dataNascita= sc.nextLine();
				LocalDate ld=DateValidator.check(dataNascita);
//				DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy"); //TO-DO DATE VALIDATOR
//				LocalDate ld= LocalDate.parse(dataNascita,dtf);
				
				System.out.println("Inserire il numero di figli: ");
				String figli= sc.nextLine();
				int numFigli=NumberValidator.check(figli);
				
				System.out.println("La persona è sposata o no? (SPOSATO/SINGLE)");
				String statoCivile= sc.nextLine().toUpperCase();
				StatoCivile st=EnumValidator.check(statoCivile);
				
				Persona p= new Persona(nome,cognome,ld,numFigli,st);
				
				System.out.println(p);
				
			}catch(VoidStringException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(DateTimeParseException e) {
				System.out.println("La data non è nel formato richiesto!" + e.getMessage());
				e.printStackTrace();
			}catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(InvalidEnumException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(DateFormatException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("Programma terminato.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package com.azienda.ereditarieta.ui;

import java.util.Scanner;

import com.azienda.ereditarieta.model.Impiegato;
import com.azienda.ereditarieta.model.Persona;

public class ChiamanteImpiegato {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
//		
//		Persona obj= new Persona("Mario", "Rossi");
//		System.out.println(obj.toString());
//		
//		Persona obj2= new Persona("Mario", "Rossi");
//		System.out.println(obj2.toString());
//		
//		if(obj.equals(obj2)) {
//			System.out.println("Gli oggetti hanno gli stessi attributi.");
//		}else {
//			System.out.println("Gli oggetti hanno attributi diversi.");
//		}
//		
//		obj= new Impiegato("Carlo", "Verdi", "IM12345");
//		System.out.println(obj.toString());
//		
//		Impiegato ref=(Impiegato) obj;
//		ref.setMatricola("IM54321");
//		System.out.println(ref.getMatricola());
		
		Persona obj = creaPersona(sc);
		System.out.println(obj);
		
		Persona obj2 =creaPersona(sc);
		System.out.println(obj2);
		
		if(obj.equals(obj2)) {
			System.out.println("Gli oggetti hanno gli stessi attributi.");
		}else {
			System.out.println("Gli oggetti hanno attributi diversi.");
		}
		
		obj= creaImpiegato(sc,obj);
		System.out.println(obj);;
		
		Impiegato ref=(Impiegato) obj;
		System.out.println("Specifica il cambio matricola: ");
		ref.setMatricola(sc.nextLine());
		
		System.out.println(ref);;
		
		sc.close();
	}
	
	private static Persona creaPersona(Scanner sc) {
		if(sc!=null) {
			System.out.println("Inserire il nome: ");
			String nome=sc.nextLine();
			System.out.println("Inserire il cognome: ");
			String cognome= sc.nextLine();
			return new Persona(nome,cognome);
			}return null;
	}
	private static Persona creaImpiegato(Scanner sc,Persona p) {
		if(sc!=null && p!=null) {
			System.out.println("Inserire la matricola: ");
			String matricola= sc.nextLine();
			return new Impiegato(p.getNome(),p.getCognome(),matricola);
			}return null;
	}

//	private static void stampaInfo(Persona p) {	//SUPERFLUO per override di toString 
//												// nelle classi padre e figlia
//		if(p instanceof Impiegato) {			// il programma capisce già
//			Impiegato ref= (Impiegato) p;		//quale metodo chiamare dei due
//			System.out.println(ref.toString()); 
//		}
//		else{
//			System.out.println(p.toString()); 
//		}
//	}
}

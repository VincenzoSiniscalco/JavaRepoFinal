package com.azienda.collections.utils;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.azienda.collections.exception.ContattoEsistenteException;
import com.azienda.collections.model.Contatto;
import com.azienda.collections.model.Persona;
import com.azienda.collections.model.Rubrica;

public class Utilities {
	
	private String leggiInputNonVuoto(Scanner sc, String messaggio) {
		System.out.print(messaggio);
		String input = sc.nextLine().trim();
		if (input.isEmpty()) {
			throw new IllegalArgumentException("L'input non può essere vuoto!");
		}
		return input;
	}

	public Contatto creaContatto(Scanner sc) {

		Supplier<Contatto> supplierContatto=()->{
			String nome = leggiInputNonVuoto(sc, "Inserisci il nome del contatto: ");
			String cognome = leggiInputNonVuoto(sc, "Inserisci il cognome del contatto: ");
			String numero = leggiInputNonVuoto(sc, "Inserisci il numero di telefono: ");
			return new Contatto(new Persona(nome,cognome),numero);
		};
		return supplierContatto.get();
	}

	public void inserisciContatto(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		System.out.println("Inserimento nuovo contatto:");
		Contatto ref=creaContatto(sc);
		if(r.getContatti().contains(ref)) {
			throw new ContattoEsistenteException("Il contatto "+ref+" è gia presente in rubrica!",null);
		}r.getContatti().add(ref);
		System.out.println("Contatto "+ref+" aggiunto con successo.");
	}
	
	public void aggiornaContattoParziale(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		System.out.println("Aggiornamento parziale del contatto:scegliere cosa cambiare tramite si/no:");
		Contatto ref= creaContatto(sc);
		int index= r.getContatti().indexOf(ref);
		if(index==-1) {
			throw new ContattoEsistenteException("Il contatto "+ref+" non esiste in rubrica!",null);
		}
		Contatto contattoDaAggiornare = r.getContatti().get(index);
		Persona persona=contattoDaAggiornare.getPersona();

		BiConsumer<String, Consumer<String>> aggiornaCampo = (domanda, setter) -> {
			System.out.print(domanda + " (si/no): ");
			String risposta=leggiInputNonVuoto(sc, domanda + " (si/no): ");
			if (risposta.equalsIgnoreCase("si")) {
				String nuovoValore= leggiInputNonVuoto(sc, "Inserisci il nuovo valore: ");
				setter.accept(nuovoValore);
			}
		};

		aggiornaCampo.accept("Vuoi modificare il nome del contatto?", persona::setNome);
		aggiornaCampo.accept("Vuoi modificare il cognome del contatto?", persona::setCognome);
		aggiornaCampo.accept("Vuoi modificare il numero di telefono?", contattoDaAggiornare::setNumeroTelefono);

		System.out.println("Contatto modificato!\n"+contattoDaAggiornare);

	}
	public void aggiornaContatto(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		System.out.println("Aggiornamento totale del contatto: inserire le nuove informazioni");
		Contatto ref= creaContatto(sc);
		int index= r.getContatti().indexOf(ref);
		if(index==-1) {
			throw new ContattoEsistenteException("Il contatto "+ref+" non esiste in rubrica!",null);
		}
		System.out.println("Aggiorna il nome del contatto: ");
		
		String nome=leggiInputNonVuoto(sc, "Aggiorna il nome del contatto: ");
		
		System.out.println("Aggiorna il cognome:");
		String cognome=leggiInputNonVuoto(sc, "Aggiorna il cognome del contatto: ");
		
		System.out.println("Aggiorna il numero di telefono: ");
		String numero=leggiInputNonVuoto(sc, "Aggiorna il numero del contatto: ");

		r.getContatti().set(index, new Contatto(new Persona(nome,cognome),numero));
		System.out.println("Contatto aggiornato!");

	}
	public void cancellaContatto(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		System.out.println("Cancellazione del contatto:");
		Contatto ref= creaContatto(sc);
		int index= r.getContatti().indexOf(ref);
		if(index==-1) {
			throw new ContattoEsistenteException("Il contatto "+ref+" non esiste in rubrica!",null);
		}
		r.getContatti().remove(index);
		System.out.println("Contatto eliminato!");
	}
	public void cancellaContattoByNumero(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		System.out.println("Cancellazione del contatto passando numero di telefono: ");
		
		String numero=leggiInputNonVuoto(sc, "Inserisci il numero del contatto da cancellare: ");
		
		boolean rimosso= r.getContatti().removeIf(c->c.getNumeroTelefono().equals(numero));
		if(rimosso) {
			System.out.println("Contatto rimosso!");
		}else {

			throw new ContattoEsistenteException("Il numero "+numero+" non è presente in rubrica: impossibila rimuovere il contatto!", null);
		}
	}
	private void ricercaContatto(Scanner sc,Rubrica r,String tipo, Function<Contatto,String> chiaveExtractor) throws ContattoEsistenteException{
		System.out.print("Inserisci il " + tipo + " da cercare: ");
		String valore=leggiInputNonVuoto(sc, "Inserisci il " + tipo + " da cercare: ");
		
		List<Contatto> trovati = new ArrayList<>();

		Predicate<Contatto> filtro = c -> chiaveExtractor.apply(c).equalsIgnoreCase(valore);

		r.getContatti().forEach(c -> {
			if (filtro.test(c)) trovati.add(c);
		});

		if (trovati.isEmpty()) {
			throw new ContattoEsistenteException("Nessun contatto trovato con " + tipo + ": " + valore, null);
		}

		System.out.println("Contatti trovati:");
		trovati.forEach(System.out::println);
	}

	public void ricercaContattoPerNome(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		ricercaContatto(sc,r,"nome",c->c.getPersona().getNome());

	}
	public void ricercaContattoPerCognome(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		ricercaContatto(sc,r,"cognome",c->c.getPersona().getCognome());
	}
	public void ricercaContattoPerNumeroDiTelefono(Scanner sc,Rubrica r) throws ContattoEsistenteException {
		ricercaContatto(sc,r,"numero di telefono",Contatto::getNumeroTelefono);
	}


	public void visualizzaContatti(Rubrica r) {
		System.out.println("\nContatti in ordine di inserimento:");
		if(r.getContatti().isEmpty()) {
			System.out.println("Non ci sono contatti in rubrica!");
			return;
		}
		r.getContatti().forEach(System.out::println);

	}

	private void visualizzaContattiOrdinati(Rubrica r,String tipo,Comparator<Contatto> comparator) {
		System.out.println("\nContatti ordinati per " + tipo + ":");
		if (r.getContatti().isEmpty()) {
			System.out.println("Rubrica vuota!");
			return;
		}
		List<Contatto> contatti= new ArrayList<Contatto>(r.getContatti());
		Collections.sort(contatti,comparator);
		contatti.forEach(System.out::println);
	}

	public void visualizzaContattiOrdinatiPerNome(Rubrica r) {
		visualizzaContattiOrdinati(r, "nome", (c1,c2)->c1.getPersona().getNome().compareTo(c2.getPersona().getNome()));
	}

	public void visualizzaContattiOrdinatiPerCognome(Rubrica r) {
		visualizzaContattiOrdinati(r, "nome", (c1,c2)->c1.getPersona().getCognome().compareTo(c2.getPersona().getCognome()));
	}

	public void visualizzaContattiOrdinatiPerCognomeNome(Rubrica r) {
		visualizzaContattiOrdinati(r, "nome", new PersonaComparatorePerCognomeNome());
	}
}

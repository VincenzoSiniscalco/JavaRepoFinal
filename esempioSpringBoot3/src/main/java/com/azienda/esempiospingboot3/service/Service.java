package com.azienda.esempiospingboot3.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.azienda.esempiospingboot3.model.Macchina;
import com.azienda.esempiospingboot3.model.Persona;
import com.azienda.esempiospingboot3.repository.AutomobileRepository;
import com.azienda.esempiospingboot3.repository.PersonaRepository;
import com.azienda.esempiospingboot3.transaction.Transaction;
@Component
public class Service {
	private Transaction transaction;
	private AutomobileRepository automobileRepository;
	private PersonaRepository personaRepository;
	
	public Service(@Qualifier("automobileRepository")AutomobileRepository automobileRepository,@Qualifier("personaRepository") PersonaRepository personaRepository,@Qualifier("transaction")Transaction transaction) {
		super();
		this.automobileRepository = automobileRepository;
		this.personaRepository = personaRepository;
		this.transaction=transaction;
	}
	
	public void insertParametric(String modello,Float cilindrata,String nome,String cognome) throws SQLException {
		try {
			Macchina m= new Macchina(modello,cilindrata);
			
			automobileRepository.create(m);
			System.out.println("Commit inserimento automobile...");
			
			Persona p= new Persona(nome,cognome);
			
			personaRepository.create(p);
			System.out.println("Commit inserimento persona...");
			
			transaction.commit();
			System.out.println("Inserisco la persona "+p+" in quanto proprietaria dell'auto "+m);
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
	}
	public List<Macchina> searchMacchine() throws SQLException {
		try {
			List<Macchina> automobili=automobileRepository.read();
			System.out.println("Stampo lista automobili e restituisco riferimento alla lista: commit...");
			transaction.commit();
			return automobili;
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
	}
	public List<Persona> searchPersone() throws SQLException {
		try {
			List<Persona> persone=personaRepository.read();
			System.out.println("Stampo lista persone e restituisco riferimento alla lista: commit...");
			transaction.commit();
			return persone;
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
	}
	public void updateParametric(String modello,Float cilindrata,String nome,String cognome,Integer idMacchina,Integer idPersona) throws SQLException {
		try {
			Macchina m= new Macchina(modello,cilindrata);
			m.setId(idMacchina);
			automobileRepository.update(m);
			
			Persona p= new Persona(nome,cognome);
			p.setId(idPersona);
			personaRepository.update(p);
			
			System.out.println("Update della macchina: "+modello+" di cilindrata "+ cilindrata +" di proprietà di "+nome+" "+ cognome +" commit...");
			transaction.commit();
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
		
	}

	public void deleteParametricAuto(String modello,Integer id) throws SQLException {
		try {
			Macchina m= new Macchina(modello,null);
			m.setId(id);
			automobileRepository.delete(m);
			System.out.println("Cancellazione della macchina "+ modello +": commit...");
			transaction.commit();
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
	}
	public void deleteParametricPersona(String nome,String cognome,Integer id) throws SQLException {
		try {
			Persona p= new Persona(nome,cognome);
			p.setId(id);
			personaRepository.delete(p);
			System.out.println("Cancellazione della persona "+ nome + " "+ cognome +": commit...");
			transaction.commit();
		} catch (Exception e) {
			System.out.println("La transazione è fallita, eseguo rollback...");
			transaction.rollback();
			throw e;
		}
	}
}

package com.azienda.jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.azienda.jdbc.model.Persona;
import com.azienda.jdbc.repository.PersonaRepository;

public class Servizio {
	private PersonaRepository personaRepository;
	private Connection c;
	
	public Servizio(PersonaRepository personaRepository, Connection c) {
		super();
		this.personaRepository = personaRepository;
		this.c = c;
	}

	public void insertParametric(String nome,String cognome) throws SQLException {
		try {
			Persona p= new Persona(nome,cognome);
			personaRepository.create(p);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}

	public List<Persona> search() throws SQLException {
		try {
			List<Persona> persone=personaRepository.read();
			c.commit();
			return persone;
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	public void updateParametric(String nome,String cognome,Integer id) throws SQLException {
		try {
			Persona p= new Persona(id,nome,cognome);
			personaRepository.update(p);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}

	
	
	public void deleteParametric(Integer id) throws SQLException {
		try {
			Persona p= new Persona(id,null,null);
			personaRepository.delete(p);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
}

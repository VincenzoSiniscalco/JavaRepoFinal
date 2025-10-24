package com.azienda.esempioSpringData2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.azienda.esempioSpringData2.model.Profilo;
import com.azienda.esempioSpringData2.model.Utente;
import com.azienda.esempioSpringData2.repository.ProfiloRepository;
import com.azienda.esempioSpringData2.repository.UtenteRepository;

@Service 
@Transactional
public class GestioneService {
	
	@Autowired 
	private UtenteRepository utenteRepository;
	@Autowired 
	private ProfiloRepository profiloRepository;
	
	public Profilo creaAdmin() {
		Profilo admin = profiloRepository.findByNome(Profilo.TIPO_ADMIN);
		if(admin==null) {
			admin = new Profilo(Profilo.TIPO_ADMIN);
			profiloRepository.save(admin);
		}
		return admin;
	}
	
	public Profilo creaUser() {
		Profilo user = profiloRepository.findByNome(Profilo.TIPO_USER);
		if(user==null) {
			user = new Profilo(Profilo.TIPO_USER);
			profiloRepository.save(user);
		}
		return user;
	}
	
	public Utente creaUtente(String user,String password,String tipo) {
		if(usernameAlreadyExists(user)) {
			throw new IllegalArgumentException("L'username esiste già!");
		}
		Profilo profilo= profiloRepository.findByNome(tipo);
		
		if(profilo==null) {
			throw new IllegalArgumentException("Il profilo non esiste!");
		}
		Utente utente= new Utente(user,password,profilo);
		utenteRepository.save(utente);
		return utente;
	}
	
	public boolean verificaLogin(String user,String password) {
		Utente utente=utenteRepository.findByUsernameAndPassword(user, password);
		return utente!=null;
	}
	
	public boolean isAdmin(String user,String password) {
		Utente utente=utenteRepository.findByUsernameAndPassword(user, password);
		if(utente!=null && utente.getProfilo()!=null) {
			return utente.getProfilo().getNome().equalsIgnoreCase(Profilo.TIPO_ADMIN);
		}
		return false;
		
	}
	
	private boolean usernameAlreadyExists(String username) {
		List<Utente> utenti= utenteRepository.findAll();
		for(Utente u : utenti) {
			if(u.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;
	}
}

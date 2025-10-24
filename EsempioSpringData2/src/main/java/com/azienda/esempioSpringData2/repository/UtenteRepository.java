package com.azienda.esempioSpringData2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azienda.esempioSpringData2.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	Utente findByUsernameAndPassword(String username,String password);
	
}

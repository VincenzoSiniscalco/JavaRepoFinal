package com.azienda.esempioSpringData3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azienda.esempioSpringData3.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	Persona findByNomeAndCognome(String nome,String cognome);
}

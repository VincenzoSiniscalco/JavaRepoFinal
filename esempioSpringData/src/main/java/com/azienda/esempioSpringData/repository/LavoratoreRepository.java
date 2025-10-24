package com.azienda.esempioSpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azienda.esempioSpringData.model.Lavoratore;

public interface LavoratoreRepository extends JpaRepository<Lavoratore,Integer> {
	
	public Lavoratore findByMatricola(Integer matricola);
	
}

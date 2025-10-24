package com.azienda.esempioSpringData2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azienda.esempioSpringData2.model.Profilo;

public interface ProfiloRepository extends JpaRepository<Profilo , Integer>{
	Profilo findByNome(String nome);
}

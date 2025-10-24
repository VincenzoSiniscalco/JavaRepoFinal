package com.azienda.esempioSpringData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.azienda.esempioSpringData.model.Sede;

public interface SedeRepository extends JpaRepository<Sede , Integer>{

	@Query("select s from Sede s where s.citta= :parcitta")
	public Sede ricercaPerCitta(@Param("parcitta")  String s);
	
	public List<Sede> findByCittaLike(String citta);
	
}

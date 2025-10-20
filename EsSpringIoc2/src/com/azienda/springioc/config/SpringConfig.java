package com.azienda.springioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.azienda.springioc.model.Banca;
import com.azienda.springioc.model.ContoCorrente;
import com.azienda.springioc.model.Indirizzo;

@Configuration
public class SpringConfig {
	@Bean 
	public Indirizzo indirizzo1() {
		return new Indirizzo("Roma","Piazza di Spagna",1);
	}
	
	@Bean
	public Banca banca1() {
		return new Banca("Intesa San Paolo",indirizzo1());
	}
	
	@Bean
	public Banca banca2() {
		Banca b= new Banca();
		b.setNome("Unicredit");
		b.setIndirizzo(indirizzo1());
		return b;
	}
	
	@Bean
	public ContoCorrente conto1() {
		return new ContoCorrente("IT8754687453290",banca1());
	}
	@Bean
	public ContoCorrente conto2() {
		return new ContoCorrente("IT4566198616530",banca2());
	}
}

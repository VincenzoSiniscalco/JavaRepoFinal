package com.azienda.springioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.azienda.springioc.model.Banca;
import com.azienda.springioc.model.ContoCorrente;
import com.azienda.springioc.model.Indirizzo;

@Configuration
@ComponentScan(basePackages="com.azienda.springioc.model")
public class SpringConfig {
	@Bean 
	public Indirizzo indirizzo1() {
		return new Indirizzo("Roma","Piazza di Spagna",1);
	}
	
	@Bean
	public Indirizzo indirizzo2() {
		return new Indirizzo("Roma","Via Appia",1);
	}
	
	@Bean
	public Banca banca1() {
		return new Banca("Intesa San Paolo",indirizzo1());
	}
	
	
	@Bean
	public Banca banca2() {
		return new Banca("Intesa",indirizzo2());
	}
	
	@Bean
	public ContoCorrente conto1() {
		return new ContoCorrente();
	}
	@Bean
	public ContoCorrente conto2() {
		return new ContoCorrente("87654321",banca2());
	}
	@Bean
	public ContoCorrente conto3() {
		Banca banca= new Banca("BBVA",null);
		ContoCorrente c= new ContoCorrente("5555555555",banca);
		return c;
	}
}

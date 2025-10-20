package com.azienda.springioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.azienda.springioc.model.Macchina;
import com.azienda.springioc.model.Persona;

@Configuration
@ComponentScan(basePackages = {"com.azienda.springioc.model"})
public class SpringConfiguration {
	
	@Bean
	public Persona persona1() {
		Persona p= new Persona(null,null,null);
		p.setId(1);
		p.setNome("Mario");
		p.setCognome("Rossi");
		return p;
	}
	
	@Bean
	public Persona persona2() {
		return new Persona(2,"Laura","Verdi");
	}
	
	@Bean
	public Macchina macchina1() {
		Macchina m= new Macchina(null,null,null);
		m.setId(1);
		m.setModello("Modello1");
		m.setProprietario(persona1());
		return m;
	}
	@Bean
	public Macchina macchina2() {
		Macchina m= new Macchina(2, "modello2", persona2());
		return m;
	}
}

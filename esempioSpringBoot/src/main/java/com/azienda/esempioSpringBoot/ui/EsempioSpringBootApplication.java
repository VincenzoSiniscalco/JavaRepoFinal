package com.azienda.esempioSpringBoot.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.azienda.esempioSpringBoot.model.Persona;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioSpringBoot.model"})
public class EsempioSpringBootApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = 
				SpringApplication.run(EsempioSpringBootApplication.class, args)){
			
			Persona p= context.getBean("persona",Persona.class);
			System.out.println(p);
			
			Persona p2= context.getBean("personaComponent",Persona.class);
			System.out.println(p2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Bean
	public Persona persona() {
		return new Persona("Mario","Rossi");
	}

}

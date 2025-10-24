package com.azienda.esempioSpringBoot2.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.azienda.esempioSpringBoot2.model.Banca;
import com.azienda.esempioSpringBoot2.model.ContoCorrente;
import com.azienda.esempioSpringBoot2.model.Indirizzo;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioSpringBoot2.model"})
public class EsempioSpringBoot2Application {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext context= SpringApplication.run(EsempioSpringBoot2Application.class, args)) {
			ContoCorrente c = context.getBean("contoComponent",ContoCorrente.class);
			
			ContoCorrente c1 = context.getBean("conto",ContoCorrente.class);
			
			ContoCorrente c2 = context.getBean("conto2",ContoCorrente.class);
			
			System.out.println(c);
			System.out.println(c1);
			System.out.println(c2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Bean
	public Indirizzo indirizzo() {
		return new Indirizzo();
	}
	
	@Bean
	public Banca banca() {
		return new Banca("BBVA",indirizzo());
	}
	
	@Bean
	public Banca banca2() {
		Banca b= new Banca();
		b.setIndirizzo(indirizzo());
		return b;
	}

	@Bean
	public ContoCorrente conto() {
		return new ContoCorrente("12345678",banca());
	}
	@Bean
	public ContoCorrente conto2() {
		return new ContoCorrente("87654321",banca2());
	}
}

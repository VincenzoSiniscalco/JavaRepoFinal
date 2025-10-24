package com.azienda.esempioSpringData.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.azienda.esempioSpringData.service.AziendaService;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioSpringData.service"})
@EntityScan(basePackages = {"com.azienda.esempioSpringData.model"})
@EnableJpaRepositories(basePackages = {"com.azienda.esempioSpringData.repository"})
public class EsempioSpringDataApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(EsempioSpringDataApplication.class, args)) {
			
			AziendaService aziendaService =context.getBean("aziendaService",AziendaService.class);
		/*	aziendaService.creaSede("Roma");
			
			aziendaService.aggiornaSede(1, "Firenze");
			aziendaService.assunzione(15, 1500f, 1);
			
			aziendaService.getLavoratore(1); */
			aziendaService.creaSede("Roma");
			aziendaService.creaSede("Firenze");
			aziendaService.creaSede("Palermo");
			aziendaService.creaSede("Napoli");
			aziendaService.creaSede("Milano");
			
			aziendaService.insertManyToMany();
			
//			aziendaService.getLavoratore2(1);
			
			aziendaService.assegnaSedeAlLavoratore("Roma", 16);
			
			System.out.println("Elenco sedi con città che contengono la 'r' ");
			aziendaService.ricercaSediLike("%r%").forEach(System.out::println);
			
			System.out.println("Elenco sedi con città che contengono la 'i' ");
			aziendaService.ricercaSediLike("%i%").forEach(System.out::println);
			
			
			System.out.println("Programma terminato.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

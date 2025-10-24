package com.azienda.esempioSpringData2.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.azienda.esempioSpringData2.model.Profilo;
import com.azienda.esempioSpringData2.model.Utente;
import com.azienda.esempioSpringData2.service.GestioneService;


@SpringBootApplication(scanBasePackages = {"com.azienda.esempioSpringData2.service"})
@EntityScan(basePackages = {"com.azienda.esempioSpringData2.model"})
@EnableJpaRepositories(basePackages = {"com.azienda.esempioSpringData2.repository"})
public class EsempioSpringData2Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context= SpringApplication.run(EsempioSpringData2Application.class, args)){
			
			GestioneService service= context.getBean("gestioneService",GestioneService.class);
			
			Profilo p1= service.creaAdmin();
			Profilo p2=service.creaUser();
			
			System.out.println("Ho creato i profili "+p1+" e "+p2);
			
			Utente u1= service.creaUtente("MarioRossi", "password1234", Profilo.TIPO_ADMIN);
			Utente u2= service.creaUtente("ClaudioVerdi", "password4567", Profilo.TIPO_USER);
			
			List<Utente> utenti= new ArrayList<Utente>();
			utenti.add(u1);
			utenti.add(u2);
			utenti.forEach(System.out::println);
			
			System.out.println("Provo login con utente MarioRossi, password= password1234 ..." + service.verificaLogin("MarioRossi", "password1234"));
			System.out.println("Provo login con AnnaBianchi, password= blablabla ..."+service.verificaLogin("AnnaBianchi", "blablabla"));
			System.out.println("Provo login con utente ClaudioVerdi, password= password5678 ..." + service.verificaLogin("ClaudioVerdi", "password5678"));
			
			System.out.println("Verifico se l'utente MarioRossi è admin: "+service.isAdmin("MarioRossi", "password1234"));
			System.out.println("Verifico se l'utente ClaudioVerdi è admin: "+service.isAdmin("ClaudioVerdi", "password5678"));
			
			System.out.println("Programma terminato.");
		}catch (IllegalArgumentException e) {
			e.getMessage();
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

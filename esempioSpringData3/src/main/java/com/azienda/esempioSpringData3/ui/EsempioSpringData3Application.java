package com.azienda.esempioSpringData3.ui;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.azienda.esempioSpringData3.model.Banca;
import com.azienda.esempioSpringData3.model.ContoCorrente;
import com.azienda.esempioSpringData3.model.Persona;
import com.azienda.esempioSpringData3.service.ServiceBanca;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioSpringData3.service"})
@EntityScan(basePackages = {"com.azienda.esempioSpringData3.model"})
@EnableJpaRepositories(basePackages = {"com.azienda.esempioSpringData3.repository"})
public class EsempioSpringData3Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context= SpringApplication.run(EsempioSpringData3Application.class, args)){
			
			ServiceBanca serviceBanca= context.getBean("serviceBanca",ServiceBanca.class);
			
			Persona p1 = new Persona("Mario", "Rossi");
			
			Banca b1= new Banca("Intesa San Paolo");
			
			ContoCorrente c1= new ContoCorrente("IT123456789", 18000f, b1, Arrays.asList(p1));
			
			ContoCorrente c2= new ContoCorrente("IT987654321", 25000f, b1, Arrays.asList(p1));
			
			List<ContoCorrente> contiP1= Arrays.asList(c1,c2);
			
			serviceBanca.create(p1, contiP1, b1);
			
			Persona p2= new Persona("Claudia", "Verdi");
			
			ContoCorrente c3= new ContoCorrente("IT111222333", 41000f, b1, Arrays.asList(p2));
			
			ContoCorrente c4= new ContoCorrente("IT444555666", 32000f, b1, Arrays.asList(p2));
			
			List<ContoCorrente> contiP2= Arrays.asList(c3,c4);
			
			serviceBanca.create(p2, contiP2, b1);
		
			Float importoTrasferimento=10000f;
			
			System.out.println("Conti prima del trasferimento: ");
			serviceBanca.getConti(p1.getNome(),p1.getCognome());
			serviceBanca.getConti(p2.getNome(),p2.getCognome());
			
			serviceBanca.spostaFondi(p1.getNome(), p1.getCognome(), p2.getNome(), p2.getCognome(), importoTrasferimento);
			
			System.out.println("Conti dopo il trasferimento: ");
			serviceBanca.getConti(p1.getNome(),p1.getCognome());
			serviceBanca.getConti(p2.getNome(),p2.getCognome());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}

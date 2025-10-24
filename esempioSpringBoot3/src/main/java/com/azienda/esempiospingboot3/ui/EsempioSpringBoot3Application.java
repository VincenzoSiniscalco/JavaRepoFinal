package com.azienda.esempiospingboot3.ui;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.azienda.esempiospingboot3.model.Macchina;
import com.azienda.esempiospingboot3.model.Persona;
import com.azienda.esempiospingboot3.repository.AutomobileRepository;
import com.azienda.esempiospingboot3.repository.PersonaRepository;
import com.azienda.esempiospingboot3.service.Service;
import com.azienda.esempiospingboot3.transaction.Transaction;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempiospingboot3.service","com.azienda.esempiospingboot3.repository","com.azienda.esempiospingboot3.model","com.azienda.esempiospingboot3.transaction"})
public class EsempioSpringBoot3Application {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext context= SpringApplication.run(EsempioSpringBoot3Application.class, args)){
			AutomobileRepository automobileRepository= context.getBean(AutomobileRepository.class); 
			
			PersonaRepository personaRepository= context.getBean(PersonaRepository.class); 
			
			Transaction transaction= context.getBean(Transaction.class);
			
			Service service= context.getBean(Service.class);
			
			System.out.println("Inserisco automobile e persona: (chiamo service) ");
			service.insertParametric("Fiat", 500f, "Mario", "Rossi");
			System.out.println();
			
			List<Macchina>macchine=service.searchMacchine(); //Lista istanziata per non perdere il valore restituito dal metodo search
			System.out.println();
			
			List<Persona>persone=service.searchPersone();//idem
			System.out.println();
			
			System.out.println("\nCi sono "+macchine.size()+" macchine e "+persone.size()+ " persone."); //print per sfruttare i riferimenti alle liste
			System.out.println();
			
			System.out.println("\nAggiorno info persona + macchina: (chiamo service)");
			System.out.println();
			service.updateParametric("Alfa Romeo", 2000f, "Claudio", "Verdi" ,1 ,1);
			
			
			System.out.println("\nCancella auto: (chiamo service)");
			System.out.println();
			service.deleteParametricAuto("Alfa Romeo",1);
		
			
			
			System.out.println("\nCancello persona: (chiamo service)");
			System.out.println();
			service.deleteParametricPersona("Claudio", "Verdi",1);
			
			System.out.println();
			service.searchPersone();
			System.out.println();
			service.searchMacchine();
		
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

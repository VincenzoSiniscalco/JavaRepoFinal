package com.azienda.esempioSpringData3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.azienda.esempioSpringData3.model.Banca;
import com.azienda.esempioSpringData3.model.ContoCorrente;
import com.azienda.esempioSpringData3.model.Persona;
import com.azienda.esempioSpringData3.repository.BancaRepository;
import com.azienda.esempioSpringData3.repository.ContoCorrenteRepository;
import com.azienda.esempioSpringData3.repository.PersonaRepository;

@Service
@Transactional
public class ServiceBanca {

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private BancaRepository bancaRepository;

	@Autowired
	private ContoCorrenteRepository contoCorrenteRepository;

	//	inserisce su db, sfruttando i rispettivi @Repository ed in modo transazionale:
	//	banca
	//	tutti i conti presenti nella lista conti ed associati tutti a banca 
	//	persona associata a tutti i conti presenti nella lista conti
	public void create(Persona persona, List<ContoCorrente> conti,Banca banca) {
		if(banca==null) {
			throw new IllegalArgumentException("La banca non esiste!");
		}
		Banca bancaSalvata= bancaRepository.save(banca);
		if(conti.isEmpty()) {
			throw new IllegalArgumentException("I conti non esistono!");
		}
		for(ContoCorrente conto: conti) {
			conto.setBanca(bancaSalvata);
			contoCorrenteRepository.save(conto);
		}
		if(persona==null) {
			throw new IllegalArgumentException("La persona non esiste!");
		}
		persona.setContiCorrente(conti);
		personaRepository.save(persona);

	}
	//	deve cercare su db due persone, la prima con nome1 e cognome1 e la seconda con nome2 e cognome2 
	//	e solo se le trova entrambe deve decrementare il saldo di tutti i conti della prima persona
	//	ed incrementare tutti i conti della seconda persona dell’importo importo; 
	//il tutto deve avvenire in modo transazionale
	//
	public void spostaFondi(String nome1,String cognome1,String nome2,String cognome2,Float importo) {
		if(importo==null || importo<=0) {
			throw new IllegalArgumentException("L'importo dev'essere maggiore di zero!");
		}
		Persona p1= personaRepository.findByNomeAndCognome(nome1, cognome1);
		if(p1==null) {
			throw new IllegalArgumentException("La persona di partenza non esiste!");
		}
		Persona p2= personaRepository.findByNomeAndCognome(nome2, cognome2);
		if(p2==null) {
			throw new IllegalArgumentException("La persona a cui è destinato l'importo non esiste!");
		}
		
		List<ContoCorrente> contiPersona1 = personaRepository.getReferenceById(p1.getId()).getContiCorrente();
		List<ContoCorrente> contiPersona2 = personaRepository.getReferenceById(p2.getId()).getContiCorrente();

		if(contiPersona1==null|| contiPersona1.isEmpty()) {
			throw new IllegalStateException("La persona di partenza non ha conti correnti associati!");
		}
		if(contiPersona2==null|| contiPersona2.isEmpty()) {
			throw new IllegalStateException("La persona a cui è destinato l'importo non ha conti correnti associati!");
		}
		for(ContoCorrente conto: contiPersona1) {
			if(conto.getSaldo()<importo) {
				throw new IllegalStateException("I fondi sono insufficienti per un trasferimento bancario di "+importo+"!");
			}
			conto.setSaldo(conto.getSaldo()-importo);
		}
		for(ContoCorrente conto:contiPersona2) {
			conto.setSaldo(conto.getSaldo()+importo);		
		}
		

	}
	public void getConti(String nome,String cognome) {
		if(nome.isEmpty()||cognome.isEmpty()) {
			throw new IllegalArgumentException("Assicurati di inserire tutti i campi necessari alla verifica!");
		}
		Persona p= personaRepository.findByNomeAndCognome(nome, cognome);
		if(p==null) {
			throw new IllegalArgumentException("La persona di partenza non esiste!");
		}
		p.getContiCorrente().forEach(System.out::println);;
	
	}
		

}

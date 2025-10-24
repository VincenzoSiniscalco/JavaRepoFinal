package com.azienda.esempioSpringData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.azienda.esempioSpringData.model.Lavoratore;
import com.azienda.esempioSpringData.model.Ruolo;
import com.azienda.esempioSpringData.model.Sede;
import com.azienda.esempioSpringData.repository.LavoratoreRepository;
import com.azienda.esempioSpringData.repository.PersonaRepository;
import com.azienda.esempioSpringData.repository.RuoloRepository;
import com.azienda.esempioSpringData.repository.SedeRepository;

@Service
@Transactional
public class AziendaService {
	@Autowired
	private LavoratoreRepository lavoratoreRepository;
	@Autowired
	private PersonaRepository personaRepository;
	@Autowired 
	private RuoloRepository ruoloRepository;
	@Autowired 
	private SedeRepository sedeRepository;
	
	public Sede creaSede(String citta) {
		Sede s= new Sede(citta);
		sedeRepository.save(s);
		return s;
	}
	
	public Sede aggiornaSede(Integer id,String nuovaCitta) {
		Sede s= sedeRepository.findById(id).orElse(null);
		s.setCitta(nuovaCitta);
		return s;
	}
	public void cancellaSede(Integer id) {
		sedeRepository.deleteById(id);
	}
	
	public List<Sede> getSedi(){
		return sedeRepository.findAll();
	}
	
	public void assunzione(Integer matricola,Float stipendio,Integer idSede) {
		Sede s= sedeRepository.findById(idSede).orElse(null);
		Lavoratore lav=new Lavoratore(matricola,stipendio);
		lav.setSede(s);
		//s.getLavoratori().add(lav); meglio partire da sede poichè centrale come entità rispetto a lavoratore (One sede To-Many lavoratori)
		lavoratoreRepository.save(lav);
	}
	
	public Lavoratore getLavoratore(Integer id) {
		Lavoratore lav=lavoratoreRepository.findById(id).orElse(null);
		Sede s=lav.getSede();
		System.out.println(s);
		return lav;
	}
	
	public void insertManyToMany() {
		Ruolo r1= new Ruolo("Sistemista");
		Ruolo r2= new Ruolo("Developer");
		Ruolo r3= new Ruolo("Tester");
		Lavoratore lav1= new Lavoratore(16,1600f);
		Lavoratore lav2= new Lavoratore(17,1700f);
		Lavoratore lav3= new Lavoratore(18,1800f);
		
		lav1.getRuoli().add(r2);
		r2.getLavoratori().add(lav1); //procedimento inverso per fare la stessa cosa dell'istruzione precedente
		
		lav1.getRuoli().add(r3);
		
		lav2.getRuoli().add(r1);
		
		lav3.getRuoli().add(r3);
		
		ruoloRepository.save(r1);
		ruoloRepository.save(r2);
		ruoloRepository.save(r3);
		
		lavoratoreRepository.save(lav1);
		lavoratoreRepository.save(lav2);
		lavoratoreRepository.save(lav3);
		
	}
	
	public void getLavoratore2(Integer id) {
		Lavoratore lav=lavoratoreRepository.findById(id).orElse(null);
		Sede s=lav.getSede();
		System.out.println(s);
		List<Ruolo> ruoli= lav.getRuoli();
		ruoli.forEach(System.out::println);
		
	}
	
	public void assegnaSedeAlLavoratore(String cittaSede,Integer matricola) {
		Lavoratore lav= lavoratoreRepository.findByMatricola(matricola);
		Sede s= sedeRepository.ricercaPerCitta(cittaSede);
		lav.setSede(s);
	}
	
	public List<Sede> ricercaSediLike(String citta){
		return sedeRepository.findByCittaLike(citta);
	}
	
	
}

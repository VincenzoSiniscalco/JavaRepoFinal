package com.azienda.esempiospingboot3.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.azienda.esempiospingboot3.model.Persona;
@Component
public class PersonaRepository implements RepositoryInterface<Persona>{

	private List<Persona> persone= new ArrayList<Persona>();

	
	
	public PersonaRepository(List<Persona> persone) {
		super();
		this.persone = persone;
	}

	@Override
	public void create(Persona ref) throws SQLException {
		System.out.println("Aggiungo persona: ");
		ref.setId(persone.size()+1);
		persone.add(ref);
		
	}
	
	@Override
	public List<Persona> read() throws SQLException {
		System.out.println("Visualizzazione database persone:");
		persone.forEach(System.out::println);
		if(persone.isEmpty()) {
			System.out.println("Database vuoto.");
		}
		return persone;
	}

	@Override
	public void update(Persona ref) throws SQLException {
		  if (ref.getId() == null || ref.getId() <= 0) {
		        System.out.println("Id non valido!");
		        return;
		    }

		    boolean trovato = false;
		    for (int i = 0; i < persone.size(); i++) {
		        Persona p = persone.get(i);
		        if (p.getId().equals(ref.getId())) {
		            persone.set(i, ref);
		            System.out.println("Aggiornamento informazioni persona: " + ref);
		            trovato = true;
		            break;
		        }
		    }

		    if (!trovato) {
		        System.out.println("Id non valido per l'aggiornamento.");
		    }
	}

	@Override
	public void delete(Persona ref) throws SQLException {
		System.out.println("Rimuovo persona in base all'id: ");
		persone.removeIf(p-> p.getId().equals(ref.getId()));
		System.out.println("Rimossa persona"+ref+" con id "+ref.getId());
		
	}

	

}

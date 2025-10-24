package com.azienda.esempiospingboot3.repository;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.azienda.esempiospingboot3.model.Macchina;
@Component
public class AutomobileRepository implements RepositoryInterface<Macchina>{

	
	private List<Macchina> macchine= new ArrayList<Macchina>();
	
	
	
	public AutomobileRepository(List<Macchina> macchine) {
		super();
		this.macchine = macchine;
	}

	@Override
	public void create(Macchina ref) throws SQLException {
		System.out.println("Aggiungo macchina: ");
		ref.setId(macchine.size()+1);
		macchine.add(ref);
		
	}

	@Override
	public List<Macchina> read() throws SQLException {
		System.out.println("Visualizzazione database auto:");
		macchine.forEach(System.out::println);
		if(macchine.isEmpty()) {
			System.out.println("Database vuoto.");
		}
		return macchine;
	}

	@Override
	public void update(Macchina ref) throws SQLException {
		  if (ref.getId() == null || ref.getId() <= 0) {
		        System.out.println("Id non valido!");
		        return;
		    }

		    boolean trovato = false;
		    for (int i = 0; i < macchine.size(); i++) {
		        Macchina m = macchine.get(i);
		        if (m.getId().equals(ref.getId())) {
		            macchine.set(i, ref);
		            System.out.println("Aggiornamento informazioni automobile: " + ref);
		            trovato = true;
		            break;
		        }
		    }

		    if (!trovato) {
		        System.out.println("Id non valido per l'aggiornamento.");
		    }
	}

	@Override
	public void delete(Macchina ref) throws SQLException {
		macchine.removeIf(m-> m.getId().equals(ref.getId()));
		System.out.println("Rimossa macchina"+ref+" con id "+ref.getId());
		
	}

}

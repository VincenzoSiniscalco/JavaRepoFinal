package com.azienda.esempioRest2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.azienda.esempioRest2.exception.IsStringException;
import com.azienda.esempioRest2.exception.LocalitaAlreadyExistsException;
import com.azienda.esempioRest2.exception.NotFloatException;
import com.azienda.esempioRest2.exception.NotIntegerException;
import com.azienda.esempioRest2.model.Localita;
import com.azienda.esempioRest2.repository.LocalitaRepository;

public class LocalitaService implements LocalitaRepository{
	
	@Autowired
	private LocalitaRepository localitaRepository;
	
	List<Localita> localita=null;
	
	public LocalitaService() {
		localita= new ArrayList<Localita>();
		localita.add(new Localita(1,"Roma",22.5f));
		localita.add(new Localita(2,"Firenze",18.4f));
		localita.add(new Localita(3,"Torino",12.9f));
	}
	
	public List<Localita> read() {
		return localita;
	}
	
	public void insert(Integer id,String nome,Float temperatura) throws IsStringException, NotFloatException, LocalitaAlreadyExistsException{
		Localita loc = null;
		isString(nome);
		isFloat(temperatura);
	
		loc= ricercaById(id);
		if(loc!=null) {
			throw new LocalitaAlreadyExistsException("La località è già presente!", null);
		}
		loc=new Localita(id,nome,temperatura);
		localita.add(loc);
	}

	
	@Override
	public Localita ricercaById(Integer id) {
		Localita l=null;
		for(Localita loc:localita) {
			if(loc.getId().equals(id)) {
				l=loc;
				break;
			}
		}
		return l;
	}
	@Override
	public Localita ricercaByNome(String nome) {
		Localita l=null;
		for(Localita loc:localita) {
			if(loc.getNome().equals(nome)) {
				l=loc;
				break;
			}
		}
		return l;
	}
	@Override
	public List<Localita> ricercaByTemperaturaUnder(Float temperatura) {
		List<Localita> locFredde= new ArrayList<Localita>();
		for(Localita loc:localita) {
			if(loc.getTemperatura()<=temperatura) {
				locFredde.add(loc);
			}
		}
		return locFredde;
	}
	@Override
	public List<Localita> ricercaByTemperaturaOver(Float temperatura) {
		List<Localita> locCalde= new ArrayList<Localita>();
		for(Localita loc:localita) {
			if(loc.getTemperatura()>=temperatura) {
				locCalde.add(loc);
			}
		}
		return locCalde;
	}
	
	private boolean isInt(Integer i) throws NotIntegerException {
		if(i==null) {
			throw new NotIntegerException("Il campo non contiene un numero.",null);
		}
		return true;
	}
	private boolean isFloat(Float f) throws NotFloatException {
		if(f==null) {
			throw new NotFloatException("Il campo non è nel formato numerico corretto (float).",null);
		}
		return true;
	}
	private boolean isString(String s) throws IsStringException {
		if(s.isEmpty()||s.isBlank()) {
			throw new IsStringException("Non hai inserito una stringa valida!",null);
		}return true;
	}


	
}

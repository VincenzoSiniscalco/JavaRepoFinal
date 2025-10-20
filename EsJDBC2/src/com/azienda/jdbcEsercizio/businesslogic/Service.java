package com.azienda.jdbcEsercizio.businesslogic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.azienda.jdbcEsercizio.dao.AutomobileRepository;
import com.azienda.jdbcEsercizio.model.Automobile;

public class Service {
	private AutomobileRepository automobileRepository;
	private Connection con;
	
	public Service(AutomobileRepository automobileRepository, Connection con) {
		super();
		this.automobileRepository = automobileRepository;
		this.con = con;
	}
	
	public void insertParametric(String marca,String modello,String targa,String colore,Float cilindrata) throws SQLException {
		try {
			Automobile a= new Automobile(marca,modello,targa,colore,cilindrata);
			automobileRepository.create(a);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		}
	}
	public List<Automobile> search() throws SQLException {
		try {
			List<Automobile> automobili=automobileRepository.read();
			con.commit();
			return automobili;
		} catch (Exception e) {
			con.rollback();
			throw e;
		}
	}
	public void updateParametric(String marca,String targa) throws SQLException {
		try {
			Automobile a= new Automobile(null,marca,null,targa,null,null);
			automobileRepository.update(a);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		}
		
	}

	public void deleteParametric(String marca) throws SQLException {
		try {
			Automobile a= new Automobile(null,marca,null,null,null,null);
			automobileRepository.delete(a);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		}
	}
}

package com.azienda.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.azienda.jdbc.model.Persona;

public class PersonaRepository implements RepositoryInterface<Persona>{
	private Connection c;
	
	public PersonaRepository(Connection c) {
		super();
		this.c = c;
	}

	@Override
	public void create(Persona ref) throws SQLException {
		String sql="insert into persona(nome,cognome) values(?,?)";
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setString(1, ref.getNome());
		ps.setString(2, ref.getCognome());
		ps.executeUpdate();

	}

	@Override
	public List<Persona> read() throws SQLException {
		Statement st= c.createStatement();
		String sql="select * from persona";
		List<Persona> persone= new ArrayList<Persona>();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next()) {
			Integer id= rs.getInt("id");
			String nome= rs.getString("nome");
			String cognome=rs.getString("cognome");
			Persona p= new Persona(id,nome,cognome);
			persone.add(p);
		}return persone;
	}

	@Override
	public void update(Persona ref) throws SQLException {
		String sql="update persona set nome=?,cognome=? where id=?";
		PreparedStatement ps= c.prepareStatement(sql);
		ps.setString(1, ref.getNome());
		ps.setString(2, ref.getCognome());
		ps.setInt(3, ref.getId());
		ps.executeUpdate();
	}

	@Override
	public void delete(Persona ref) throws SQLException {
		String sql="delete from persona where id>=?";
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setInt(1, ref.getId());
		ps.executeUpdate();
		
	}

	
}

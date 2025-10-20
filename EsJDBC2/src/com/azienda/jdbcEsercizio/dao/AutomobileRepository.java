package com.azienda.jdbcEsercizio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.azienda.jdbcEsercizio.model.Automobile;

public class AutomobileRepository implements RepositoryInterface<Automobile>{
	
	private Connection con;
	
	
	
	public AutomobileRepository(Connection con) {
		super();
		this.con = con;
	}

	
	@Override
	public void create(Automobile ref) throws SQLException {
	
		int nextId = 1; 
		String maxIdSql = "SELECT COALESCE(MAX(id), 0) + 1 AS next_id FROM automobile";
		PreparedStatement psMax=con.prepareStatement(maxIdSql);
		ResultSet rs=psMax.executeQuery();
		if(rs.next()) {
			nextId= rs.getInt("next_id");
		}
		
		String checkAutoSql="SELECT * FROM automobile WHERE marca = ? AND modello = ? AND targa = ? AND colore = ? AND cilindrata = ? LIMIT 1";
		PreparedStatement psAutoCheck= con.prepareStatement(checkAutoSql);
		psAutoCheck.setString(1, ref.getMarca());
		psAutoCheck.setString(2, ref.getModello());
		psAutoCheck.setString(3, ref.getTarga());
		psAutoCheck.setString(4, ref.getColore());
		psAutoCheck.setFloat(5, ref.getCilindrata());
		
		ResultSet rsCheck= psAutoCheck.executeQuery();
		if(rsCheck.next()) {
			throw new SQLException("L'auto esiste già nel database!");
		}
		
		String sql="insert into automobile(id,marca,modello,targa,colore,cilindrata) "
				+ "values (?, ?, ?, ?, ?, ?)";
				
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setInt(1, nextId);
		ps.setString(2, ref.getMarca());
		ps.setString(3, ref.getModello());
		ps.setString(4, ref.getTarga());
		ps.setString(5, ref.getColore());
		ps.setFloat(6 ,ref.getCilindrata());
		ps.executeUpdate();
	}

	@Override
	public List<Automobile> read() throws SQLException {
		Statement st= con.createStatement();
		String sql="select * from automobile";
		List<Automobile> automobili= new ArrayList<Automobile>();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next()) {
			Integer id= rs.getInt("id");
			String marca= rs.getString("marca");
			String modello=rs.getString("modello");
			String targa= rs.getString("targa");
			String colore=rs.getString("colore");
			Float cilindrata= rs.getFloat("cilindrata");
		
			Automobile a= new Automobile(id,marca,modello,targa,colore,cilindrata);
			automobili.add(a);
		}return automobili;
	}

	@Override
	public void update(Automobile ref) throws SQLException {
	
		String sql="update automobile set targa=? where marca like ?";
		
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, ref.getTarga());
		ps.setString(2, ref.getMarca()+"%");
		ps.executeUpdate();
		
	}

	@Override
	public void delete(Automobile ref) throws SQLException {
		
		String sql="delete from automobile where marca like ?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, ref.getMarca()+ "%");
		ps.executeUpdate();
		
		
	}

}

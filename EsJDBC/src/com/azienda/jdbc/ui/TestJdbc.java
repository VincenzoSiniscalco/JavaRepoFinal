package com.azienda.jdbc.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.azienda.jdbc.model.Persona;

public class TestJdbc {

	public static void main(String[] args) throws SQLException {

		Connection con=null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/esempio_jdbc?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbUser = "root";
			String dbPassword = "Asdrubale150162";
			Class.forName(driverName);
			con = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			con.setAutoCommit(false);
//			insert(con,"Mario","Rossi");
//			insert(con,"Laura","Verdi");
//			insert2(con,"Laura","Verdi");
//			update(con,"Carlo","Bianchi",5);
//			delete(con,5);
			deleteParametric(con, 9);
			insertParametric(con,"Mario","Rossi");
			insertParametric(con,"Laura","Verdi");
			updateParametric(con,"Carlo","Bianchi",11);
			
			List<Persona> persone= search(con);
			System.out.println("\n Elenco persone:");
			persone.forEach(System.out::println);


			System.out.println("Programma terminato.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) con.close();
		}

	}
	private static void insert(Connection c,String nome,String cognome) throws SQLException {
		try {
			Statement st= c.createStatement();
			String sql="insert into persona(nome,cognome) values('"+nome+" ','"+cognome+"')";
			st.executeUpdate(sql);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void insert2(Connection c,String nome,String cognome) throws SQLException {
		try {
			Statement st= c.createStatement();
			String sql="insert into persona(nome,cognome) values('"+nome+" ','"+cognome+"')";
			st.executeUpdate(sql);
			st.executeUpdate(sql);
			st.executeUpdate(sql);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void update(Connection c,String nome,String cognome,Integer id) throws SQLException {
		try {
			Statement st= c.createStatement();
			String sql="update persona set nome='"+nome+"',cognome='"+cognome+"' where id="+id;
			st.executeUpdate(sql);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void delete(Connection c,Integer id) throws SQLException {
		try {
			Statement st= c.createStatement();
			String sql="delete from persona where id>="+id;
			st.executeUpdate(sql);
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static List<Persona> search(Connection c) throws SQLException {
		try {
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
			}
			c.commit();
			return persone;
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void insertParametric(Connection c,String nome,String cognome) throws SQLException {
		try {
			String sql="insert into persona(nome,cognome) values(?,?)";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cognome);
			ps.executeUpdate();
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void updateParametric(Connection c,String nome,String cognome,Integer id) throws SQLException {
		try {
			String sql="update persona set nome=?,cognome=? where id=?";
			PreparedStatement ps= c.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cognome);
			ps.setInt(3, id);
			ps.executeUpdate();
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
	private static void deleteParametric(Connection c,Integer id) throws SQLException {
		try {
			
			String sql="delete from persona where id>=?";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		}
	}
}

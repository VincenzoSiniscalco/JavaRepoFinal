package com.azienda.jdbc.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public interface RepositoryInterface<T>{
	public void create(T ref) throws SQLException;
	public List<T> read() throws SQLException;
	public void update(T ref) throws SQLException;
	public void delete(T ref) throws SQLException;
}

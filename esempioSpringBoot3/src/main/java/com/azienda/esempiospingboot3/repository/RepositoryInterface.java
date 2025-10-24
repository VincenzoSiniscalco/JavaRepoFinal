package com.azienda.esempiospingboot3.repository;

import java.sql.SQLException;
import java.util.List;


public interface RepositoryInterface<T> {
	public void create(T ref) throws SQLException;
	public List<T> read() throws SQLException;
	public void update(T ref) throws SQLException;
	public void delete(T ref) throws SQLException;
}


package com.proje.ecodation.common;

import java.sql.Connection;
import java.util.ArrayList;

import com.proje.ecodation.db.DbConnection;

public interface IImplementation<T> {

	public void create(T t);

	public void update(T t);

	public void delete(long id);

	public ArrayList<T> list();

	default Connection getInterfaceConnection() {
		DbConnection connection = new DbConnection();
		return connection.getConnection();

	}
}

package com.proje.ecodation.maintest;

import com.proje.ecodation.db.DbConnection;

public class DbMainTest {

	public static void main(String[] args) {
		DbConnection connection = new DbConnection();
		connection.getConnection();
	}
}

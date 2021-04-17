package com.proje.ecodation.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private String user = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/hastane_otomasyonu"; // ?useUnicode=yes&charsetEncodeing=UTF-8
	private Connection connection;

	public Connection getConnection() {
		try {
			if (this.connection == null || connection.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				// System.out.println("Driver başarılı bir şekilde yüklendi.");
				connection = DriverManager.getConnection(url, user, password);
				// System.out.println("Bağlantı başarılı");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}

package com.citigroup.workflow.config;

import java.sql.Connection;
import java.sql.DriverManager;




public class SpellBeeDbConfig {

	private static final String DB_DRIVER="com.mysql.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:3306/spellbee";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="test123";
	
	public Connection getConnection(){
		try {
			Class.forName(DB_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
			if (connection != null) {
				System.out.println("You made it, take control your database now!");
				return connection;
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}

package com.java.inventory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConnection {
	
	private static Connection conn;
	private static String url = "jdbc:mysql://localhost:3306/floggerdb";
	private static String user = "root";// Username of database
	private static String pass = "password";// Password of database

	public static Connection connect() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException cnfe) {
			log.error("Error: " , cnfe.getMessage());
		} catch (InstantiationException ie) {
			log.error("Error: " , ie.getMessage());
		} catch (IllegalAccessException iae) {
			log.error("Error: " , iae.getMessage());
		}
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (conn != null && !conn.isClosed())
			return conn;
		connect();
		return conn;
	}
	

	public void releaseConnection() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.sidgs.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static Connection conn;
	
	public static Connection getConnection() {
		if( conn != null )
			return conn;

		String driver = "";
		String url = "";
		String user = "";
		String password = "";

		InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream( "/db.properties" );
		Properties properties = new Properties();

		if ( inputStream == null ) {
			driver = System.getProperty("driver", "com.mysql.jdbc.Driver");
			url = System.getProperty("url");
			user = System.getProperty("user");
			password = System.getProperty("password");

		} else {
			try {
				properties.load(inputStream);
				driver = properties.getProperty("driver");
				url = properties.getProperty("url");
				user = properties.getProperty("user");
				password = properties.getProperty("password");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			properties.load(inputStream);
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return conn;
	}
	
	public static void closeConnection( Connection toBeClosed ) {
		if( toBeClosed == null )
			return;
		try {
			toBeClosed.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

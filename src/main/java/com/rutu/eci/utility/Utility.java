package com.rutu.eci.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {
	
	public static Connection connection() {

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjava193";
		String usr = "root";
		String pwd = "root";
		Connection conn = null;

		try {
			Class.forName(path);
			conn = DriverManager.getConnection(url, usr, pwd);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return conn;

	}

}
package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		}

	}

	public static Connection makeCon() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "root");
	}
}

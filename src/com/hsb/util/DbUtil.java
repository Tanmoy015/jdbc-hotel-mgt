package com.hsb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static Connection connection;

	private DbUtil() {}

	public static Connection connection() {
		try {
			connection = DriverManager.getConnection("jdbc:derby:MyDb");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}

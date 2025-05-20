package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection3 {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/mca";
		String username = "root";
		String password = "striver";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");
	}
}

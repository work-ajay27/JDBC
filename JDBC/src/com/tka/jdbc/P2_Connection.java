package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P2_Connection {
//Same code without Try and Catch

	public static void main(String[] args) throws SQLException {

//	Load the Driver
		String url = "jdbc:mysql://localhost:3306/student";
	
		String username = "root";
		String password = "striver";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");

	}
}

package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P1_Connection {
	public static void main(String[] args) {

//		Load the Driver
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "striver";

//		Connection Establish using connection Interface.

		try {
//			Establish The Connection with MySQL
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Establish Successfully");

		} catch (SQLException e) {
//			show the error messages
			int num = 4 / 0;
			e.printStackTrace();

		}
	}

}

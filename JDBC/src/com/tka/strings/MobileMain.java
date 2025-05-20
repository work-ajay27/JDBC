package com.tka.strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MobileMain {
	public static void main(String[] args) throws SQLException {
//		Create a connection

		String url = "jdbc:mysql://localhost:3306/Mobiles";
		String username = "root";
		String password = "striver";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");
		
		
		
	}
}

package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P3_SQLQueries {
	public static void main(String[] args) throws SQLException {

//		Create the connecion -Step-1

		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "striver";;

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");

//		Step-2
		String DB = "create database Books";
		Statement statement = connection.createStatement();
		statement.executeUpdate(DB);
		System.out.println("Database Created Succesfully");
		connection.close();
	}
}

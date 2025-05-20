package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P4_SelectQuery {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Student";
		String username = "root";
		String password = "striver";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful \n");

		Statement statement = connection.createStatement();
		String Query = "Select * from MCA";

		// statement.execute(Query); //hyacha result Resultset madhe store hoil
		ResultSet resultSet = statement.executeQuery(Query);

		while (resultSet.next()) {
			System.out.println("Student Name :" + resultSet.getString("name"));
	
			System.out.println("Student Roll No:"+resultSet.getInt("Roll_No"));
			System.out.println();
		}
//		close all the Objects
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println("All Objects Closed .");
	}

}

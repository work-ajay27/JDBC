package com.tka.jdbc.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P1_TableCreate {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Student";
		String username = "root";
		String password = "striver";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful \n");

//1.	Create Table

		Operations.createTable(connection);
//2. 	Insert Record

		Operations.insertRecord(connection, "Macbook m2", 67000, "Apple");
		Operations.insertRecord(connection, "Vivobook", 45000, "Asus");
		Operations.insertRecord(connection, "Yoga x3", 562322, "Lenovo");

//		Read The Data from Database

		Operations.readRecords(connection);
		

//		Delete a Record
		Operations.deleteRecord(connection,45000);

		connection.close();
	}
}

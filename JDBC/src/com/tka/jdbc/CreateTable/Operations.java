package com.tka.jdbc.CreateTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {

	public static void createTable(Connection connection) throws SQLException {

		String CreateTable = " create table if not exists Laptop( Name varchar(10),price int,Brand varchar(10))";
//		Statement is use for to Execute SQL Queries
		Statement statement = connection.createStatement();

		statement.execute(CreateTable);
		System.out.println("Table has been Created.");

		statement.close();

	}
//	Insert a Record inn the table
//	Prepared Statement => Parametrised Value sathi use hoto.

	public static void insertRecord(Connection connection, String Name, int Price, String Brand) throws SQLException {
		String insertRecord = "insert into Laptop (Name,Price,Brand) values (?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(insertRecord);

		preparedStatement.setString(1, Name);
		preparedStatement.setInt(2, Price);
		preparedStatement.setString(3, Brand);

		preparedStatement.executeUpdate(); // use with prepared Statement;

		preparedStatement.close();

		System.out.println("Data Has been inserted into the Table");
		System.out.println("Statement Object is closed");

	}

//	3. Read Data From The Table.
	
	public static void readRecords(Connection connection) throws SQLException {
		String Select = "Select * from Laptop";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(Select);

		while (resultSet.next()) {

			String Name = resultSet.getString("Name");
			int Price = resultSet.getInt("Price");
			String Brand = resultSet.getString("Brand");

			System.out.println("Name :" + Name);
			System.out.println("Price" + Price);
			System.out.println("Brand" + Brand);
		}
		resultSet.close();

//		Delete a Record

	}

	public static void deleteRecord(Connection connection, int price) throws SQLException {
		
		String DeleteQuery = "Delete from Laptop where price=?";

		PreparedStatement preparedStatement = connection.prepareStatement(DeleteQuery);
		preparedStatement.setInt(1, price);
		preparedStatement.executeUpdate();
		System.out.println("Data has been Deleted.");
		preparedStatement.close();
	}

}

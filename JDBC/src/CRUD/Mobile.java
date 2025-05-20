package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mobile {

//	1. Table Creation ->
	public static void createTable(Connection connection) throws SQLException {
		String CreateTable = " create table if not exists Mobile( Name varchar(10),price int,Brand varchar(10))";

//		To Execute the SQL Queries
		Statement statement = connection.createStatement();

		statement.execute(CreateTable);
		System.out.println("Table Has Been Created");
		statement.close();
	}
//	2. Insert Record in The Table

	public static void insertRecord(Connection connection) throws SQLException {
		String Record = "Insert into Mobile () values ('iphone',60000,'Apple')";

		Statement statement = connection.createStatement();
		statement.executeUpdate(Record);
		System.out.println("Data Has been Inserted");
		statement.close();
	}
//3. Read the data of the Table

	public static void ReadData(Connection connection) throws SQLException {
		String Query = "select * from Mobile";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(Query);

		while (resultset.next()) {
			String Name = resultset.getString("name");
			int Price = resultset.getInt("price");
			String Brand = resultset.getString("brand");

			System.out.println("Name :" + Name);
			System.out.println("Price :" + Price);
			System.out.println("Brand :" + Brand);

			System.out.println();
		}

	}

//4. Delete Data from Table
	public static void DeleteRecord(Connection connection) throws SQLException {

		Statement statement = connection.createStatement();
		String DeleteQuery = " Delete from mobile where Name='iphone' ";

		statement.executeUpdate(DeleteQuery);
		System.out.println("Data has been deleted");
		
		statement.close();
		
	}

}

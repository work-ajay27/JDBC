package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MobileMain {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/CellPhone";
		String username = "root";
		String password = "striver";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful \n");

//		1. Create Table call
		Mobile.createTable(connection);
//		2.Insert Record
		Mobile.insertRecord(connection);
//		3.Read Data
		Mobile.ReadData(connection);
//	4.Delete Records
		Mobile.DeleteRecord(connection);

		connection.close();

	}
}

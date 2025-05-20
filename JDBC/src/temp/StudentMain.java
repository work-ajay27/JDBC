package temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentMain {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Temp";
		String username = "root";
		String password = "striver";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");

//		Create Table Method
		Student.CreateTable(connection);
		
	}
}

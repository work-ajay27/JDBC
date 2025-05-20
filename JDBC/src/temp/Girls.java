package temp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Girls {

	public void createTable(Connection connection) throws SQLException {
		String CreateTable = " create table if not exists GirlStudents( Name varchar(10),Roll_No int,Subject varchar(10))";
		
		Statement statement=connection.createStatement();
		statement.execute(CreateTable);
		System.out.println("Table created Succesfully");
		
	}
}

package jdbcpractice.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/prodaptjdbc";
	
	public static Connection CreateConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, "root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

package jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnSingleton {
private static DBConnSingleton singletonClass;
private static final String URL = "jdbc:mysql://localhost:3306/prodapt";
Connection conn=null;
private DBConnSingleton(){
	try {
		conn=DriverManager.getConnection(URL,"root","admin");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection getInstance(){
	if(singletonClass==null) 
	{
		singletonClass=new DBConnSingleton();
	}
	return singletonClass.conn;
}
}

package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	private static Connection con;
	public static void OpenConnection () throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://locahost:3306/book","root","root123");
	}
	
	public static Connection getConnection () {
		return con;
	}
	
	public static void closeConnection () throws SQLException {
		if (con!=null) {
			con.close();
		}
	}
}
